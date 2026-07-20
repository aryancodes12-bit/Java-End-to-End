package MustDoProb;
//Problem: University Fee Management System
//interface
interface Chargeable {
    double calculateCharge(double amount); //"Any class that implements me must provide a calculateCharge() method."
}
// abstraction
abstract class Student{ //Because we never want to create a generic student. //Instead we create  ScholarshipStudent     RegularStudent
    private final String course;
    private int studentId;
    private String name;
    protected int feeBalance;
    public Student(int studentId, String name, String course, double feeBalance) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.feeBalance = (int) feeBalance;
    }

    public String getCourse() {
        return course;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFeeBalance() {
        return feeBalance;
    }

    public void setFeeBalance(int feeBalance) {
        this.feeBalance = feeBalance;
    }


    public void displayDetails() {
        System.out.println("ID      : " + studentId);
        System.out.println("Name    : " + name);
        System.out.println("Course  : " + course);
        System.out.println("Fee Due : ₹" + feeBalance);
    }
    abstract public void payFee(double amount); //Every child class MUST implement payFee()
}
class RegularStudent extends Student implements Chargeable{
    public RegularStudent(int id, String name, String course, double feeBalance) {
        super(id, name, course, feeBalance);
    }

    @Override
    public void payFee(double amount) {
        if (amount <= feeBalance && amount > 0) {
            feeBalance -= amount;
            System.out.println("Fee Paid Successfully!");
            System.out.println("Remaining Fee : ₹" + feeBalance);
        } else {
            System.out.println("Invalid Payment!");
        }
    }

    @Override
    public double calculateCharge(double amount) {
        return amount * 0.02;
    }
}
class ScholarshipStudent extends Student implements Chargeable{

    private boolean scholarshipApplied = false;

    public ScholarshipStudent(int id, String name, String course, double feeBalance) {
        super(id, name, course, feeBalance);
    }

    private void applyScholarship() {
        if (!scholarshipApplied) {
            feeBalance = (int) (feeBalance * 0.80); // 20% discount
            scholarshipApplied = true;
            System.out.println("20% Scholarship Applied!");
            System.out.println("Fee After Scholarship : ₹" + feeBalance);
        }
    }

    @Override
    public void payFee(double amount) {

        applyScholarship();

        if (amount <= feeBalance && amount > 0) {
            feeBalance -= amount;
            System.out.println("Fee Paid Successfully!");
            System.out.println("Remaining Fee : ₹" + feeBalance);
        } else {
            System.out.println("Invalid Payment!");
        }
    }

    @Override
    public double calculateCharge(double amount) {
        return amount * 0.01;
    }
}
public class AllAboutOOPS {
    public static void main(String[] args) {
        RegularStudent s1 = new RegularStudent(
                101,
                "Aryan",
                "IT",
                50000);

        ScholarshipStudent s2 = new ScholarshipStudent(
                102,
                "Rahul",
                "CSE",
                60000);

        System.out.println("===== Regular Student =====");
        s1.displayDetails();

        double payment1 = 20000;
        System.out.println("Processing Charge : ₹" + s1.calculateCharge(payment1));
        s1.payFee(payment1);

        System.out.println();

        System.out.println("===== Scholarship Student =====");
        s2.displayDetails();

        double payment2 = 40000;
        System.out.println("Processing Charge : ₹" + s2.calculateCharge(payment2));
        s2.payFee(payment2);
    }
}


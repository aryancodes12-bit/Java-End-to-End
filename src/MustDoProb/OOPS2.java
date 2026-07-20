package MustDoProb;
interface Taxable{
    double calculateTax(double salary);
}
abstract class Employee {
    private int employeeId;
    private String employeeName;
    protected int salary;

    public Employee(int employeeId, String employeeName, int salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("id"+employeeId);
       System.out.println("name"+employeeName);
       System.out.println("salary"+salary);
    }
    abstract void calculateSalary();
}
class FullTimeEmployee extends Employee implements Taxable{
    public FullTimeEmployee(int employeeId, String employeeName, int salary) {
        super(employeeId, employeeName, salary);
    }

    @Override
    void calculateSalary() {
        double bonus= salary*(0.10);
        double finalSalary=salary+bonus;
        double tax= calculateTax(finalSalary);
        System.out.println("Bonus          : ₹" + bonus);
        System.out.println("Final Salary   : ₹" + finalSalary);
        System.out.println("Tax            : ₹" + tax);
        System.out.println("Salary After Tax : ₹" + (finalSalary - tax));
    }

    @Override
    public double calculateTax(double salary) {
        return 0.05*salary;
    }
}
class PartTimeEmployee extends Employee implements Taxable {

    public PartTimeEmployee(int id, String name, double salary) {
        super(id, name, (int) salary);
    }

    @Override
    public void calculateSalary() {

        double overtime = 2000;
        double finalSalary = salary + overtime;
        double tax = calculateTax(finalSalary);

        System.out.println("Overtime       : ₹" + overtime);
        System.out.println("Final Salary   : ₹" + finalSalary);
        System.out.println("Tax            : ₹" + tax);
        System.out.println("Salary After Tax : ₹" + (finalSalary - tax));
    }

    @Override
    public double calculateTax(double salary) {
        return salary * 0.02;
    }
}
public class OOPS2 {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(101, "Aryan", 50000);
        Employee e2 = new PartTimeEmployee(102, "Rahul", 30000);
        System.out.println("fullTime");
        e1.displayDetails();
        e1.calculateSalary();

        System.out.println("PartTime");
        e2.displayDetails();
        e2.calculateSalary();
    }
}
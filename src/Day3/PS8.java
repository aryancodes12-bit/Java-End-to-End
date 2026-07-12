package Day3;
//class Employee {
//    int salary;
//    String name;
//
//   public int getSalary() {
//        return salary;
//    }
//    public String getName(){
//       return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
//public class PS8 {
//    public static void main(String[] args) {
//    Employee obj1=new Employee();
//    obj1.setName("Aryan");
//   obj1.salary=45000;
//    obj1.getName();
//        obj1.getSalary();
//        System.out.println("The name is "+ obj1.getName());
//        System.out.println("the salary is "+ obj1.getSalary());
//    }


// problem 4
class Rectangle{
    double length;
    double breadth;
    double peri;
    double area;
    public double getArea() {
        return length*breadth;
    }
    public void setSide(double a,double b) {
      length=a;
        breadth=b;
    }
    public double getPeri() {
        return 2*(length*breadth);
    }
}
public class PS8 {
    public static void main(String[] args) {
        Rectangle obj=new Rectangle();
        obj.length=14;
        obj.breadth=7;
        System.out.println("the perimeter is"+ obj.getPeri());
        System.out.println("the area is "+ obj.getArea());
    }
}


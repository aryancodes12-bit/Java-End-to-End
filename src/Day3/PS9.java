package Day3;

//package Day3;
          // problem 2
//class cylinder{
//    int radius;
//    int height;
//
//    public cylinder(int a, int b ){
//        radius=a;
//        height=b;
//    }
//
//}
//
//public class PS9 {
//    public static void main(String[] args) {
//        cylinder c=new cylinder(4,6);
//        System.out.println("Radius"+c.radius);  System.out.println("Height"+c.radius);
//    }
//}
//  problem 4
class rectangle{
   private int length;
    private int breadth;

    public rectangle(){
        this.length=4;
        this.breadth=5;
    } public rectangle(int a ){
        length=a;
        this.breadth=4;
    } public rectangle(int a , int b){
       length=a;
       breadth=b;
    }
public void getAns(){
    System.out.println("length"+ length);
    System.out.println("breadth"+breadth);
}

}
public class PS9 {
    public static void main(String[] args) {
        rectangle rc=new rectangle();
        rc.getAns();
        rectangle rc1=new rectangle(7);
        rc1.getAns();
        rectangle rc2=new rectangle(8,9);
       rc2.getAns();
    }
}
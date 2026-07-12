package Day4;
class base {
    int x;
    String name;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        System.out.println("I m in base class");
    }
}
    class derived extends base{
        int y ;
        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

public class inheritance {
    public static void main(String[] args) {
base b=new base();
b.setX(69);
        System.out.println(b.getX());
        derived d = new derived();
        d.setY(78);
        System.out.println(d.getY());
    }
}
// another method using constructor
//package Day4;
//
//class base {
//    int x;
//    String name;
//
//    public base(String n) {
//        name = n;
//    }
//
//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }
//}
//
//class derived extends base {
//    int y;
//
//    // FIX: Created a constructor for derived that passes the required name to base
//    public derived(String n, int y) {
//        super(n); // Passes the String 'n' up to the base constructor
//        this.y = y;
//    }
//
//    public int getY() {
//        return y;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }
//}
//
//public class inheritance {
//    public static void main(String[] args) {
//        base b = new base("i am in base class setting x");
//        System.out.println("Base X: " + b.getX());
//
//        // FIX: Provided both the String (for base) and int (for derived) parameters
//        derived d = new derived("i am in derived class", 50);
//        System.out.println("Derived Y: " + d.getY());
//    }
//}

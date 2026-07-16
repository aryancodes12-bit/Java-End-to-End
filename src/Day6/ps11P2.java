package Day6;

abstract class Pen12{
    public abstract  void write();
    public abstract void refill();
}
class Pen11 extends Pen{
    @Override
    public void refill() {
        System.out.println("refilling...");
    }

    @Override
    public void write() {
        System.out.println("Writing....");
    }
    public void changeNib(){
        System.out.println("changing...");
    }
}

public class ps11P2 {
    public static void main(String[] args) {
        Pen11 o=new Pen11();
        o.refill();
        o.write();
        o.changeNib();
    }


}



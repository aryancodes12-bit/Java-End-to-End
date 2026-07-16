package Day6;
abstract class Pen{
    public abstract  void write();
    public abstract void refill();
}
class Pen1 extends Pen{
    @Override
    public void refill() {
        System.out.println("refilling...");
    }

    @Override
    public void write() {
        System.out.println("Writing....");
    }
}
public class PS11_interfaces {
    public static void main(String[] args) {
        Pen1 o=new Pen1();
        o.refill();
        o.write();
    }


}

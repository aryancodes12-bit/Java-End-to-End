package Day6;
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class Smartelephone extends Telephone{
    @Override
    void disconnect() {
        System.out.println("disconnecting....");
    }

    @Override
    void lift() {
        System.out.println("lifting...");
    }

    @Override
    void ring() {
        System.out.println("ringing...");
    }
}
public class ps11P4 {
    public static void main(String[] args) {
        Telephone t= new Smartelephone();
        t.disconnect();
        t.ring();
        t.lift();
    }
}

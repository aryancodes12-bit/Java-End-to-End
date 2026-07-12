package Day4;
class phone{
    void showTime(){
        System.out.println(" its 8 am ");
    }
 void music() {
     System.out.println("turning music on phone");
 }
}
class smartPhone extends phone {
    @Override
    void music() {
        System.out.println("turning music on smartPhone");

}
void on(){
    System.out.println("turning on smartPhone");
}
}
public class dynamic_method_dispatch {
    public static void main(String[] args) {
        phone obj=new phone();
        obj.music();
        obj.showTime();
        phone p=new smartPhone();
        smartPhone s=new smartPhone();
        s.on();

    }
}

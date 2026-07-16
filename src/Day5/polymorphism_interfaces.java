package Day5;

interface camera1{
    void clickPict();
    void recordVideo();
}
interface wifi1{
    String [] getNetworks();
    void connectToNetwork(String network);
}
class cellphone1{
    void callNumber(int phoneNo){
        System.out.println("calling"+ phoneNo);
    }
    void pickCall(){
        System.out.println("picking up");
    }
}
class smartphone1 extends cellphone implements camera1,wifi1{
    @Override
    public void connectToNetwork(String network) {
        System.out.println("connecting..."+ network);
    }

    @Override
    public String[] getNetworks() {
        String [] networkList={"aryan","sethiji"};
        return networkList;
    }

    @Override
    public void recordVideo() {
        System.out.println("recording...");
    }

    @Override
    public void clickPict() {
        System.out.println("clicking pictures");
    }
}
public class polymorphism_interfaces {
    public static void main(String[] args) {
        smartphone s=new smartphone();
        String [] arr=s.getNetworks();
        for(String st:arr){
            System.out.println(st);
        }
        s.callNumber(99999999);
        s.pickCall();
        camera1 c=new smartphone1();
        c.clickPict();
        //c.pickCall(); --> not allowed
    }
}





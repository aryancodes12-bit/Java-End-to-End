package Day5;
interface camera{
    void clickPict();
    void recordVideo();
}
interface wifi{
String [] getNetworks();
void connectToNetwork(String network);
}
class cellphone{
    void callNumber(int phoneNo){
        System.out.println("calling"+ phoneNo);
    }
    void pickCall(){
        System.out.println("picking up");
    }
}
class smartphone extends cellphone implements camera,wifi{
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
public class default_methods {
    public static void main(String[] args) {
        smartphone s=new smartphone();
        String [] arr=s.getNetworks();
        for(String st:arr){
            System.out.println(st);
        }
        s.callNumber(99999999);
        s.pickCall();
    }
}

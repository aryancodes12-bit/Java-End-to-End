package Day6;
interface TvRemote{
    void changeChannel();
    void volumeUp();
}
interface SmartTvRemote extends TvRemote {
    void voiceControl(); // Additional feature unique to smart remotes
}
class SmartTv implements TvRemote{
    @Override
    public void changeChannel() {
        System.out.println("i m smartTv changing channel");
    }

    @Override
    public void volumeUp() {
        System.out.println(" i am smartTv volume up");
    }


    public void voiceControl() {
        System.out.println(" i can controlVoice");
    }
}
public class ps11P6 {
    public static void main(String[] args) {
        SmartTv s = new SmartTv();
        s.changeChannel();
        s.volumeUp();
        s.voiceControl();
    }
}

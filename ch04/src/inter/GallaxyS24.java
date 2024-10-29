package inter;

public class GallaxyS24 implements MusicPhoneInterface {
    @Override
    public void playList() {
        System.out.println("내가 좋아하는 play list를 재생합니다.");
    }

    @Override
    public void play() {
        System.out.println("mp3 재생");
    }

    @Override
    public void stop() {
        System.out.println("mp3 멈춤");
    }

    @Override
    public void sendSMS() {
        System.out.println("sms 보내기");
    }

    @Override
    public void receiveSMS() {
        System.out.println("sms 받기");
    }

    @Override
    public void sendCall() {
        System.out.println("지문인식으로 전화를 겁니다.");
    }

    @Override
    public void receiveCall() {
        System.out.println("gallaxy가 전화를 받습니다.");
    }
}

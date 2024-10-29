package inter;

public class SamsungPhone implements PhoneInterface {
    @Override
    public void sendCall() {
        System.out.println("지문인식으로 전화를 겁니다.");
    }

    @Override
    public void receiveCall() {
        System.out.println("gallaxy가 전화를 받습니다.");
    }
}

package inter;

public class ApplePhone implements PhoneInterface {
    @Override
    public void sendCall() {
        System.out.println("사과폰이 전화를 겁니다. 안면인식으로 ");
    }

    @Override
    public void receiveCall() {
        System.out.println("사과폰이 전화를 받습니다. 밀어서 잠금해제");
    }
}

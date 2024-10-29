public class GasCar extends Car {

    public void fillUp() {
        System.out.println("가스로 차를 충전합니다.");
    }

    @Override
    public void move() {
        System.out.println("빨리 움직입니다.");
    }
    //override의 조건
    //1.이름이 같아야 한다,.
    //2. 리턴값이 같아야 한다.
    //3. 매개변수 갯수랑 타입도 같아야 한다.
    //move() 재정의, 덮어쓰기...

}

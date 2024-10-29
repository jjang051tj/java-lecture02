import java.awt.*;

//자바 클래스는 다중상속 안됨
//자바의 모든 객체는 최상위 객인 Object를 상속받아 사용한다.
//자바 컴파일러가 자동으로 상속해준다.
public class ColorPoint extends Point {

    private String color;

    public ColorPoint() {
        //super();
        // 부모생성자를 호출하는 함수이다.
        // 쓰지 않으면 자동으로 호출 해준다
        // 이떄 만약 부모에 생성자가 없으면 자동으로 빈생성자를 만들어 주기때문에 super() 호출이 가능하다.
        // 만약 부모 생성자에 임의의 생성자가 만들어져 있으면 빈 생성자는 만들어지지 않으므로
        // 형식에 맞는 부모 함수를 호출해서 써야 한다.
        //super();
    }

    public ColorPoint(int x, int y, String color) {
        //set(x,y);
        super(x,y);
        //new Point();
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void showColorPoint() {
        showPoint();
        System.out.println("color : "+color);
    }
}

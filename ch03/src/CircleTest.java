import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {

        // Rectangle int width, height,   int  getArea()
        //객체는 참조값을 가진다.
        Circle circle = new Circle();
        circle.name = "피자";
        double area = circle.getArea();
        System.out.println(area);

        Circle circle02 = new Circle();
        circle02.name = "도넛";
        System.out.println(circle);  //메모리 주소
        System.out.println(circle02);
        System.out.println(circle.name);
        System.out.println(circle02.name);

        Rectangle rect01 = new Rectangle();
        rect01.width=100;
        rect01.height=20;
        System.out.println(rect01.getArea());

    }
}

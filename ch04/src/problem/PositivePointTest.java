package problem;

public class PositivePointTest {
    public static void main(String[] args) {
        PositivePoint positivePoint = new PositivePoint(10,10);
        System.out.println(positivePoint.toString());
        positivePoint.move(-5,5);
        System.out.println(positivePoint.toString());
        positivePoint.move(-5,-10);
        System.out.println(positivePoint.toString());
        positivePoint.move(20,20);
        System.out.println(positivePoint.toString());
    }
}

public class PointTest {
    public static void main(String[] args) {
//        Point point = new Point();
//        point.set(10,20);
//        point.showPoint();

//        1,2,5,6,7,8
//        ColorPoint colorPoint02 = new ColorPoint(30,40,"red");
//        colorPoint02.showPoint();
        ColorPoint colorPoint = new ColorPoint();
        colorPoint.setColor("red");
        colorPoint.showColorPoint();

        ColorPoint colorPoint02 =  new ColorPoint(30,40,"red");
        colorPoint02.showColorPoint();
    }
}

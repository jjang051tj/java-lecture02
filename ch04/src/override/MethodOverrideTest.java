package override;
//덮어쓰기
class Shape {
    public void draw() {
        System.out.println("Shape Draw");
    }
}
class Line extends Shape {
    //메서드 오버로드
    public void draw(String msg) {
        System.out.println(msg+"Line Draw");
        //super.draw();
    }
}
public class MethodOverrideTest {
    public static void paint(Shape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
        paint(new Shape());
        paint(new Line());
        Line line = new Line();
        line.draw();
    }
}

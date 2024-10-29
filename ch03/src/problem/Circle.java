//폴더 개념
package problem;

public class Circle {
    // 속성을 함부로 노출하면 안됨
    // 클래스도 변수 함수
    // 생성자 함수  overload

    //속성 propeties  명사
    private double x, y;
    private int radius;
    public Circle(double x, double y, int radius) {
        this.x=x;
        this.y=y;
        this.radius=radius;
    }

    //생성자 함수 Constructor
    public Circle(int radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
    //method
    public void show() {
        System.out.printf("(x : %f,y : %f) r : %d   ",x,y,radius);
    }
}

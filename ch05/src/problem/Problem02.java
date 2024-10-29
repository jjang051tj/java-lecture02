package problem;
class Circle {
    private int x, y, radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle(x=" + x +", y=" + y +")"+",radius=" + radius;
    }

    @Override
    public boolean equals(Object obj) {
        Circle circle = (Circle) obj;
        if(circle.x==x && circle.y == y) return true;
        return false;
    }
}
public class Problem02 {
    public static void main(String[] args) {
        Circle circle01 = new Circle(5,5,10);
        Circle circle02 = new Circle(5,5,10);
        System.out.println("원 a : "+circle01.toString());
        System.out.println("원 b : "+circle02.toString());
        //System.out.println(circle01==circle02);
        if(circle01.equals(circle02)){
            System.out.println("같은 원입니다.");
        }else  {
            System.out.println("다른 원입니다.");
        }
    }
}

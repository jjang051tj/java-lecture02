package problem;

class Point {
    private int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        Point point = (Point)obj;
        if(x== point.x && y == point.y) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Point("+x+","+y+")";
    }
}

public class Problem01 {
    public static void main(String[] args) {
        Point point01 = new Point(10,10);
        Point point02 = new Point(10,10);
        point01.toString();
        point02.toString();
        if(point01.equals(point02)) {
            System.out.println("같은 점");
        } else {
        System.out.println("다른 점");
        }
    }
}

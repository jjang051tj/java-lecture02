class Point {
    private int x;
    private int y;
    //alt + insert

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point(" + x + "," + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        // point의 같다 다르다를 바꾸고 싶다.
        // 좌표가 같으면 같은걸로 바꾸고 싶다.
        //return super.equals(obj);
        //형변환 type casting upcastring / downcasting
        Point point = (Point)obj;
        if(x==point.x && y==point.y) {
            return true;
        }
        return false;
    }
}

public class ObjectTest {
    public static void main(String[] args) {
        //객체는 참조
        // new 생성자를 통해서 만들어진 객체는 heap 영역에 올려둔다.
        Point point = new Point(10, 20);
        Point point02 = new Point(10, 20);
        Point point03 = point;
        System.out.println(point.getClass());
        System.out.println(point.getClass().getName());
        System.out.println(point.hashCode());
        System.out.println(point02.hashCode());
        System.out.println(point.toString()); // override 믾이 하기 때문에 이걸로 같은거 따지면 안됨
        System.out.println(point02.toString());
        System.out.println(point);
        //객체 비교
        if (point == point02) {
            System.out.println("point는 point02와 같다");
        } else {
            System.out.println("point는 point02와 다르다");
        }

        if (point == point03) {
            System.out.println("point는 point03와 같다");
        } else {
            System.out.println("point는 point03와 다르다");
        }
        if(point.equals(point02)) {
            System.out.println("point는 point02와 같다");
        } else {
            System.out.println("point는 point02와 다르다");
        }
    }
}

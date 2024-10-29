class Rect {
    private int width;
    private int height;

    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        Rect rect = (Rect) obj;
        if (rect.width * rect.height == width * height) {
            return true;
        }
        return false;
    }
}

public class RectObjectTest {
    public static void main(String[] args) {
        Rect rect01 = new Rect(10, 10);
        Rect rect02 = new Rect(20, 5);
        if (rect01.equals(rect02)) {
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }
    }
    //Wrapper 클래스는 primitive 를 객체로 바꾼 클래스
    //Byte,Short,Integer,Long,Character,Float, Double,Boolean
}

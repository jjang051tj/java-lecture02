package problem;

public class Rectangle {
    int x, y, width, height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    int square() {
        return width * height;
    }

    void show() {
        System.out.printf("(%d,%d)에서 크기가 %dx%d인 사각형", x, y, width, height);
    }

    boolean contains(Rectangle r) {
        if (r.x > x && r.y > y && r.x+r.width < x+width && r.y+r.height < y+height) {
            return true;
        }
        return false;
    }
}

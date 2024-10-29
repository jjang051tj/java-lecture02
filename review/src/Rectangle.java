public class Rectangle {
    int width;
    int height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int calcPerimeter() {
        return width*2+height*2;
    }
    int calcArea() {
        return width*height;
    }
    boolean isSquare() {
        return width==height;
    }
}

//public / private   protected, default
public class Point {
    private int x;
    private int y;

    public Point() {
        set(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void showPoint() {
        System.out.print("("+x+","+y+") ");
    }
}

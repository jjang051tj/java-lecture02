package problem;

public class TV {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public TV(int size) {
        this.size = size;
    }
    public String toString() {
        return "TV [size=" + size + ", getSize()=" + getSize() + "]";
    }
}

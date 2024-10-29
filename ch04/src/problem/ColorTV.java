package problem;

public class ColorTV extends TV {
    private int colorNum;

    public ColorTV(int size, int colorNum) {
        super(size);
        this.colorNum = colorNum;
    }
    public void printProperty() {
        System.out.println(this.getSize()+"인치 "+
                this.colorNum+"컬러 TV");
    }
}

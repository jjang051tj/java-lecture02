package problem;

public class TV {
    int year;
    String maker;
    int size;
    TV(String maker,int year, int size) {
        this.maker = maker;
        this.year = year;
        this.size = size;
    }
    void show() {
        System.out.printf("%s에서 만든 %d년형 %d인치 TV",maker,year,size);
    }
}

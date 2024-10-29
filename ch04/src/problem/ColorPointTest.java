package problem;

public class ColorPointTest {
    public static void main(String[] args) {
        ColorPoint colorPoint = new ColorPoint(10,10,"RED");
        //System.out.println(colorPoint.toString());
        String str1 =  colorPoint.toString();
        System.out.println("처음 정의된 colorPoint는 "+str1+"입니다.");
        colorPoint.move(20,20);
        colorPoint.setColor("YELLOW");
        String str2= colorPoint.toString();
        System.out.println("이동한 colorPoint는 "+str2+"입니다.");

    }
}

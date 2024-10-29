public class RectangleTest {
    public static void main(String[] args) {
        int width = 5;
        int height = 8;
        // 둘레, 면적, 정사각형인지도 알고 싶다.
        int perimeter = calcPerimeter(5,8);
        int area = calcArea(5,8);
        boolean isSquare = isSquare(5,8);
        System.out.println(perimeter);
        System.out.println(area);
        System.out.println(isSquare?"정사각형":"직사각형");
        System.out.println("============");
        //oop
        Rectangle myRect = new Rectangle();
        //속성의 값을 직접 대입하는건 지양한다.
        myRect.width=5;
        myRect.height=5;
        System.out.println(myRect.calcPerimeter());
        System.out.println(myRect.calcArea());
        System.out.println(myRect.isSquare()?"정사각형":"직사각형");


        Rectangle myRect02 = new Rectangle(10,10);
        System.out.println(myRect02.calcPerimeter());
        System.out.println(myRect02.calcArea());
        System.out.println(myRect02.isSquare()?"정사각형":"직사각형");

    }
    static int calcPerimeter(int width,int height) {
        return width*2+height*2;
    }
    static int calcArea(int width,int height) {
        return width*height;
    }
    static boolean isSquare(int width,int height) {
        return width==height;
    }

}

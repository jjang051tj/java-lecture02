package problem;

import java.util.Scanner;

public class CircleManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c[] = new Circle[3]; // 3개의 Circle 배열 선언
        for (int i = 0; i < c.length; i++) {
            System.out.print("x, y, radius >> ");
            int x = sc.nextInt(); // x값 읽기.
            int y = sc.nextInt(); // y값 읽기.
            int radius = sc.nextInt(); // radius값 읽기.
            c[i] = new Circle(x, y, radius); // Circle 객체 생성
        }
        for (int i = 0; i < c.length; i++) {
            c[i].show(); // 모든 Circle 객체 출력
        }

        //  10, 20, 5,8,9,2,3,4,40
        // i = 1  / bigIndex = 0;    10 < 20  bigIndex = 1
        // i = 2  / bigIndex = 1     20 >  5  bigIndex = 1
        // i = 3  / bigIndex = 1     20 >  8  bigIndex = 1
        // i = 8  / bigIndex = 1     20 < 40  bigIndex = 8
        int bigIndex = 0;
        for (int i = 1; i < c.length; i++) {
            //제일 큰 원을 출력
            if (c[i].getArea() > c[bigIndex].getArea()) {
                bigIndex = i;
            }
        }
        System.out.printf("제일 큰원은 %d번째 원이고 크기는 %.2f 이다",bigIndex+1,c[bigIndex].getArea());
        sc.close();
    }
}

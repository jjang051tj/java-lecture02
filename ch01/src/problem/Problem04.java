package problem;

import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        System.out.println("숫자 3개를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int center;
        if(a>=b && a<=c || a>=c && a<=b) {
            center=a;
        } else if(b>=a && b<=c || b>=c && b<=a) {
            center=b;
        } else {
            center=c;
        }
        System.out.println("세 숫자"+a+","+b+","+c+"의 중간값은 "+center+"입니다.");
        System.out.printf("세 숫자 %d,%d,%d의 중간값은 %d",a,b,c,center);
    }
}

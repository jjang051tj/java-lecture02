package problem;

import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 세개를 입력하세요, 삼각형이 되는지 알려드립니다.");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a+b < c  || a+c < b || b+c < a) {
            System.out.println("삼각형이 될 수 없습니다.");
        } else {
            System.out.println("삼각형이 될 수 있습니다.");
        }
    }
}

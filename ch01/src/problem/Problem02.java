package problem;

import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("10~99사이 숫자를 입력하시오");
        int num = scanner.nextInt();
        int num01 = num/10;
        int num02 =  num%10;
        if(num01==num02) {
            System.out.println("같다");
        } else {
            System.out.println("다르다.");
        }
    }
}

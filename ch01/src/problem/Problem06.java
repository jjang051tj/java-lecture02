package problem;

import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1~99 사이의 숫자를 입력하세요");
        int num = scanner.nextInt();
        //3 박수짝 , 36 박수 짝짝
        int first = num/10;
        int second = num%10;
        int count = 0;
        if(first!=0  && first%3==0) {
            count++;
        }
        if(second!=0 && second%3==0) {
            count++;
        }
        if(count==1) {
            System.out.println("박수 짝");
        }
        if(count==2) {
            System.out.println("박수 짝짝");
        }
    }
}

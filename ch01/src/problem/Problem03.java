package problem;

import java.util.Scanner;
public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("금액을 입력하세요.");
        int rest = 0;
        int money = scanner.nextInt();
        //반복문에 배열 섞어 쓰면 좀 편하게 할 수 있음
        int money50000 = money/50000;
        rest =  money%50000;
        int money10000 = rest/10000;
        rest =  money%10000;
        int money5000 = rest/5000;
        rest =  money%5000;
        int money1000 = rest/1000;
        rest =  money%1000;
        int money500 = rest/500;
        rest =  money%500;
        int money100 = rest/100;
        rest =  money%100;
        int money50 = rest/50;
        rest =  money%50;
        System.out.printf("오만원권 %d장 만원권 %d장 오천원권 %d장 천원권 %d장 오백원동전 %d개 백원동전 %d개  오십원동전 %d개",money50000,money10000,money5000,money1000,money500,money100,money50);
    }
}

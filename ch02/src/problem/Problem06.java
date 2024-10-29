package problem;

import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("금액을 입력하세요.");
        int money = scanner.nextInt();
        //563450
        int unit [] = {50000,10000,5000,1000,500,100,50,10};

        for(int i=0;i<unit.length;i++) {
            int rest = money/unit[i];
            if(rest<=0) continue;
            System.out.println(unit[i] + "원권 " + rest + "장");
            money = money % unit[i];
            //0인거 제거
        }
    }
}

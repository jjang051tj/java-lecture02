package problem;

import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int won = scanner.nextInt();
        double dollar = won/1300.0;
        //System.out.println(won+"원은 $"+dollar+"입니다.");
        System.out.printf("%d원은 $%.2f입니다.",won,dollar);
    }
}

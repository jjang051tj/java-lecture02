package problem;

import java.util.Scanner;

public class Problem08Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("연산을 해드립니다. ex) 12 + 10");
        int a = scanner.nextInt();
        String op = scanner.next();
        int b = scanner.nextInt();
        int result = 0;
        result = switch (op) {
            case "+" -> a + b; // 단일 수행
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> {
                if (b == 0) {
                    System.out.println("0으로 나눌 수는 없습니다.");
                    yield -1; //return 값이랑 같다.
                } else {
                    yield a / b;
                }
            }
            default -> {
                System.out.println("잘못된 연산입니다.");
                yield -1;
            }
        };
        System.out.printf("%d %s %d의 결과는 %d", a, op, b, result);
    }
    //switch 21
}

package problem;

import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("연산을 해드립니다. ex) 12 + 10");
        int a = scanner.nextInt();
        String op =  scanner.next();
        int b = scanner.nextInt();
        int result=0;
        if(op.equals("+")) {
            result = a+b;
        } else if(op.equals("-")) {
            result = a-b;
        } else if(op.equals("*")) {
            result = a*b;
        } else if(op.equals("/")) {
            result = a/b;
        }
        System.out.printf("%d %s %d의 결과는 %d",a,op,b,result);
    }
    //switch 21
}

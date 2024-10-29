package problem;


import java.io.BufferedInputStream;
import java.util.Scanner;

// 생산성을 높여준다.
// front  == vscode  back == IntelliJ
public class StackApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("총 스택의 크기를 입력하시오. >> ");
        int num = scanner.nextInt();
        StringStack stringStack = new StringStack(num);
        while(true) {
            System.out.print("문자 입력 >> ");
            String str = scanner.next();
            if(str.equals("그만") || str.equals("끝")) {
                break;
            }
            boolean isPush = stringStack.push(str);
            if(isPush==false) {
                System.out.println("스택이 가득 차서 푸쉬 불가");
            }
        }

        System.out.println("스택에 저장된 모든 문자 출력");
        System.out.println(stringStack.length());
        for(int i=0;i<=stringStack.length();i++) {
            System.out.println(stringStack.pop());
        }
    }
}

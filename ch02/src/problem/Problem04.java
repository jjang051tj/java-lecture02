package problem;

import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        //char  67 A
//        System.out.println((int)'가');
//        System.out.println((int)'힣');
        System.out.println("알파벳을 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();  //
        char ch =  str.charAt(0);
        for(char i=ch;i>='a';i--) {
            for(char j='a';j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }

//        int num=0;
//        for(char i = '가';i <= '힣';i++) {
//            System.out.print(i);
//            num++;
//        }
//        System.out.println(num);
    }
}

package problem;

import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        System.out.println("문자열을 입력하세요. >>");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for(int i=0;i<str.length();i++) {
            String firstStr = str.substring(0, 1);
            String restStr = str.substring(1);
            System.out.println(restStr + firstStr);
            str = restStr + firstStr;
        }
        //abcdefg
        //bcdefga
        //cdefgab
    }
}

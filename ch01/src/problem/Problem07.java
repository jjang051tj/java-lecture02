package problem;

import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1~12사이 숫자를 입력하세요");
        int num = scanner.nextInt();
        String season = "";
        if (num >= 3 && num <= 5) {
            season = "봄";
        } else if (num >= 6 && num <= 8) {
            season = "여름";
        } else if (num >= 9 && num <= 11) {
            season = "가을";
        } else if (num >= 12 && num <= 2) {
            season = "겨울";
        } else {
            season = "잘못입력하였습니다.";
        }
        System.out.println(season);
    }
}

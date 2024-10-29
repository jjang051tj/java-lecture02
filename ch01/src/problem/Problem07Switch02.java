package problem;

import java.util.Scanner;

public class Problem07Switch02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1~12사이 숫자를 입력하세요");
        int num = scanner.nextInt();
        String season = "";
        //jdk 21 이상에서만 사용 가능
        season = switch (num) {
            case 12, 1, 2 -> "겨울";
            case 3, 4, 5 -> "봄";
            case 6, 7, 8 -> "여름";
            case 9, 10, 11 -> "가을";
            default -> "잘못 입력하였습니다.";
        };
        System.out.println(season);
    }
}

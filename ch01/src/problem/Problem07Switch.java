package problem;

import java.util.Scanner;

public class Problem07Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1~12사이 숫자를 입력하세요");
        int num = scanner.nextInt();
        String season = "";
        switch(num) {
            case 12 :
            case 1 :
            case 2 :
                season = "겨울";
                break;
            case 3 :
            case 4 :
            case 5 :
                season = "봄";
                break;
            case 6 :
            case 7 :
            case 8 :
                season = "여름";
                break;
            case 9 :
            case 10 :
            case 11 :
                season = "가을";
                break;
            default:
                season="잘못 입력하였습니다.";
        }
        System.out.println(season);
    }
}

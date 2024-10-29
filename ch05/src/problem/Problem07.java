package problem;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String word = scanner.nextLine();
            if(word.equals("그만") || word.equals("끝")) {
                System.out.println("종료합니다.");
                return;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(word," ");
            int num =  stringTokenizer.countTokens();
            System.out.println(word+"의 어절갯수는  "+num+"입니다.");
            String[] wordList = word.split(" ");
            System.out.println(word+"의 어절갯수는  "+wordList.length+"입니다.");
        }
    }
}

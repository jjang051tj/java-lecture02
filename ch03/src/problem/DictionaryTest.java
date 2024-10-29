package problem;

import java.util.Scanner;

public class DictionaryTest  {
    public static void test() {
        System.out.println("static test 입니다.");
    }
    public static void main(String[] args) {
        // static안에서는  static으로 선언된 것들만 불러다 쓸 수 있다,
        // static으로 선언된 것들은 따로 생상해서 쓸  필요없다.
        Scanner scanner = new Scanner(System.in);
        System.out.println("한영사전입니다.");
        while(true) {
            System.out.println("겅색할 한글 단어를 입력하세요.");
            String kor = scanner.next();
            Math.random();
            if(kor.equals("그만") || kor.equals("끝")) {
                break;
            }
            String eng = Dictionary.kor2Eng(kor);
            if(eng==null) {
                System.out.println("한영 사전에 없는 단어입니다.");
            } else {
                System.out.println(kor+"는 영어로 "+eng+"입니다.");
            }
        }
    }
}

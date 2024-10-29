package problem;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("전화번호를 입력하세요.");
            //문자 입출력은 writer, reader
            FileWriter fileWriter = new FileWriter("temp/phone.txt");
            while(true) {
                System.out.print("이름 전화번호 ex) 장성호 010-1111-2222");
                String line = scanner.nextLine();
                if(line.equals("그만")) break;
                fileWriter.write(line+"\r\n");
            }
            System.out.println("전화번호가 저장되었습니다.");
            scanner.close();
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

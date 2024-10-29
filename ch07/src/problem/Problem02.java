package problem;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Problem02 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("temp/phone.txt");
            System.out.println("전화번호를 출력합니다.");
            while(true) {
                int c = fileReader.read();
                //eof  end of file
                if(c==-1) break;
                System.out.print((char)c);
            }
            fileReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package problem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem0202 {
    public static void main(String[] args) {
        try {
            //BufferedReader 는 보조스트림
            FileReader fileReader = new FileReader("temp/phone.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader, 1024 * 8);
            System.out.println("전화번호를 출력합니다.");
            /*
            String line = null;
            while (true) {
                line = bufferedReader.readLine();
                if(line==null) break;
                System.out.println(line);
            }
             */
            int c = 0;
            while(true) {
                c = bufferedReader.read();
                if(c==-1) break;
                //System.out.print((char)c);
                System.out.print((char)c);
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

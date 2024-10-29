package problem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Problem03 {
    public static void main(String[] args) {
        File file = new File("temp/system.ini");
        try {
            FileReader fileReader = new FileReader(file);
            //한글자씩 읽으면 됨
            int c=0;
            while(true) {
                c = fileReader.read();
                char ch = (char)c;
                if(Character.isLowerCase(ch))  {
                    ch = Character.toUpperCase(ch);
                }
                System.out.print(ch);
                if(c==-1) break;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

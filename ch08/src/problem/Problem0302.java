package problem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Problem0302 {
    public static void main(String[] args) {
        Path path = Path.of("temp/system.ini");
        try {
            String contents = new String(Files.readAllBytes(path));
            //System.out.println(contents);
            System.out.println(contents.length());
            System.out.println(contents.toUpperCase());
            char charArray[] = contents.toCharArray();
            for(char ch : charArray) {
                if(Character.isLowerCase(ch))  {
                    ch = Character.toUpperCase(ch);
                }
                System.out.print(ch);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

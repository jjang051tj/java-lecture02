package problem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Problem0402 {
    public static void main(String[] args) {
        Path path = Path.of("temp/system.ini");
        try {
            List<String> lines =  Files.readAllLines(path);
            for(int i=0;i<lines.size();i++) {
                System.out.println(i+1+" : "+lines.get(i));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadWriteTest {
    public static void main(String[] args) {
        /*
        String str = "가나가\r\nabc";
        File file = new File("temp03/hello.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(str);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
         */
        String str = "가나가\r\nabc";
        Path path = Path.of("temp03/hello.txt");
        try {
            Files.writeString(path,str, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            String readStr = Files.readString(path,StandardCharsets.UTF_8);
            System.out.println(readStr);
            //여러줄 읽기
            List<String> list = Files.readAllLines(path,StandardCharsets.UTF_8);
            for(int i=0;i<list.size();i++) {
                System.out.println(i+1+" : "+list.get(i));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

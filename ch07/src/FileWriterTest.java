import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            FileWriter fileWriter = new FileWriter("temp/write.txt");
            while(true) {
                String str = scanner.nextLine();
                if(str.length()==0) break; //그냥 엔터쳐서
                fileWriter.write(str);
                fileWriter.write("\r\n"); //캐리지 리턴
            }
            //fileWriter.write("A");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

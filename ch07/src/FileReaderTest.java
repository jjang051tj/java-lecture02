import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args)  {
        //외부에 있는 파일들은
        //오류 잡기 try catch
        // 오류 발생

        //컴파일 오류  실행전에 미리 알려진 오류 실행 자체가 안됨
        //런타임 오류  실행을 하고나서야 알게되는 오류
        try {
            int c;
            FileReader fileReader = new FileReader("temp/sample.txt");
            while(true) {
                c = fileReader.read();
                if(c==-1) break;
                System.out.print((char)c);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
            // 프로그램이 종료되지는 않는다.
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

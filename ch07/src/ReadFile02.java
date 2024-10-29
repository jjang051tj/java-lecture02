import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile02 {
    public static void main(String[] args) {
        try {
            //보조스트림
            FileInputStream fileInputStream = new FileInputStream(BufferConstant.FILE_NAME);
            long startTime = System.currentTimeMillis();
            byte buffer[] = new byte[BufferConstant.BUFFER_SIZE];
            int fileSize = 0;
            int size=0;
            while ((size = fileInputStream.read(buffer))!=-1) {
                fileSize+=size;
            }
            fileInputStream.close();
            long endTime = System.currentTimeMillis();
            System.out.println("파일==="+BufferConstant.FILE_NAME);
            System.out.println("파일 크기==="+BufferConstant.FILE_SIZE/1024/1024+"mb");
            System.out.println("파일 쓰기에 걸린 시간==="+(endTime - startTime)+"ms");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

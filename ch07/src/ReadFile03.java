import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile03 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream(BufferConstant.FILE_NAME);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream,BufferConstant.BUFFER_SIZE);
            long startTime = System.currentTimeMillis();
            int fileSize = 0;
            int data =  0;
            while((data = bufferedInputStream.read())!=-1) {
                fileSize++;
            }
            bufferedInputStream.close();
            long endTime = System.currentTimeMillis();
            System.out.println("파일==="+BufferConstant.FILE_NAME);
            System.out.println("파일 크기==="+BufferConstant.FILE_SIZE/1024/1024+"mb");
            System.out.println("파일 쓰기에 걸린 시간==="+(endTime - startTime)+"ms");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

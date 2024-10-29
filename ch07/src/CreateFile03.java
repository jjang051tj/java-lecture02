import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile03 {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(BufferConstant.FILE_NAME);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream,BufferConstant.BUFFER_SIZE);
            long startTime = System.currentTimeMillis();
            for(int i=0;i<BufferConstant.FILE_SIZE;i++) {
                bufferedOutputStream.write(1);
            }
            bufferedOutputStream.close();
            long endTime = System.currentTimeMillis();
            System.out.println("파일==="+BufferConstant.FILE_NAME);
            System.out.println("파일 크기==="+BufferConstant.FILE_SIZE/1024/1024+"mb");
            System.out.println("파일 쓰기에 걸린 시간==="+(endTime - startTime)+"ms");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

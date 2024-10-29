import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile02 {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(BufferConstant.FILE_NAME);
            long startTime = System.currentTimeMillis(); //milli second로 보여준다.
            byte buffer[] =  new byte[BufferConstant.BUFFER_SIZE];
            int bufferIdx = 0;
            for(int i=0;i<BufferConstant.FILE_SIZE;i++) {
                buffer[bufferIdx]=1;
                bufferIdx++;
                if(bufferIdx==BufferConstant.BUFFER_SIZE) {
                    fileOutputStream.write(buffer);
                    bufferIdx=0;
                }
            }
            if(bufferIdx > 0) {
                fileOutputStream.write(buffer,0,bufferIdx);
            }
            fileOutputStream.close();
            long endTime = System.currentTimeMillis();
            System.out.println("파일==="+BufferConstant.FILE_NAME);
            System.out.println("파일 크기==="+BufferConstant.FILE_SIZE/1024/1024+"mb");
            System.out.println("파일 쓰기에 걸린 시간==="+(endTime - startTime)+"ms");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

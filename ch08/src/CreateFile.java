import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {

    public static final int FILE_SIZE = 1024 * 1024 * 200;

    public static void main(String[] args) {
        String fileName = "temp03/copy.dat";
        long startTime = System.currentTimeMillis();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            byte buffer []  = new byte[FILE_SIZE];
            fileOutputStream.write(buffer);
            fileOutputStream.close();
            long endTime =  System.currentTimeMillis();
            System.out.println("생성된 파일 : "+fileName);
            System.out.println("생성된 파일 size : "+(FILE_SIZE/1024)+"mb");
            System.out.println("걸린 시간 : "+(endTime - startTime)+"ms");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

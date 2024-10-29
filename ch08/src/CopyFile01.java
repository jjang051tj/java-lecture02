import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile01 {
    public static void main(String[] args) {
        //quiz
        try {
            long startTime = System.currentTimeMillis();
            FileInputStream fileInputStream = new FileInputStream("temp03/copy.dat");
            FileOutputStream fileOutputStream = new FileOutputStream("temp/copy_new.dat");
//            byte bytes[] = fileInputStream.readAllBytes();//한번에 싹 읽기
//            fileOutputStream.write(bytes);
            fileInputStream.transferTo(fileOutputStream);
            fileInputStream.close();
            fileOutputStream.close();
            long endTime = System.currentTimeMillis();
            System.out.println("걸린 시간 : "+(endTime - startTime)+"ms");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

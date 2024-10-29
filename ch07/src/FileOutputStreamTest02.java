import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileOutputStreamTest02 {
    public static void main(String[] args) {
        byte byteList [] = {65,66,67};
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("temp/write03.out");
//            for(int i=0;i<byteList.length;i++) {
//                fileOutputStream.write(byteList[i]);
//            }
            //buffer
            fileOutputStream.write(byteList);
            fileOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("temp/write03.out");
            byte buffer [] =  new byte [10]; //빈 배열
            //buffer를 쓰는 이유는 빨리할려고....
            //int readCount = fileInputStream.read(buffer,0,byteList.length);
            //int readCount = fileInputStream.read(buffer);
            //System.out.println(readCount);
            System.out.println(Arrays.toString(buffer));
            byte readBytes[] = fileInputStream.readAllBytes(); //0부터 싹다 읽어오기...
            System.out.println(Arrays.toString(readBytes));

            //buffer==container
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

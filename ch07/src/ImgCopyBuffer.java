import java.io.*;

public class ImgCopyBuffer {
    public static void main(String[] args) {
        File sourceFile =  new File("temp/jun.jpg");
        File copyFile = new File("temp/copy-jun-buffer.jpg");

        try {

            FileInputStream fileInputStream = new FileInputStream(sourceFile);
            FileOutputStream fileOutputStream = new FileOutputStream(copyFile);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream,1024*8);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream,1024*8);
            long startTime = System.currentTimeMillis(); //mill
            int c = 0;
            while((c = bufferedInputStream.read())!=-1) {
                bufferedOutputStream.write((byte)c);
            }
            bufferedInputStream.close();
            bufferedOutputStream.close();
            fileInputStream.close();
            fileOutputStream.close();
            long endTime = System.currentTimeMillis();
            System.out.println(endTime - startTime+"ms");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

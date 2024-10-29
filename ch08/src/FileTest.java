import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {

        //예전에 이렇게 했음...  legacy code
        //자바에서 파일 만들기..
        //폴더 만들기.
        File file = new File("temp/example.txt");
        File directory = new File("temp/exampleDir");

        System.out.println("is File : "+file.isFile());
        System.out.println("is File : "+directory.isFile());

        System.out.println("is File : "+file.isDirectory());
        System.out.println("is File : "+directory.isDirectory());

        // profile.jpg   profile.jpg
        System.out.println("File name : "+file.getName());
        System.out.println("File 크기 : "+file.length());

        File newFile = new File("temp/newExample.txt");
        boolean isRenamed = file.renameTo(newFile);
        System.out.println("isRenamed==="+isRenamed);

        //파일이 복사되고 이름이 바뀌어서 저장된다.
        if(!directory.exists()) {
            directory.mkdir();
        }
        if(file.exists()) {
            System.out.println("temp/example.txt이 있습니다.");
            file.delete();
        } else {
            try {
                boolean isCreate = file.createNewFile();
                System.out.println(isCreate);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("temp/example.txt이  없습니다.");
        }
        System.out.println("temp/example.txt "+file.exists());
    }
}

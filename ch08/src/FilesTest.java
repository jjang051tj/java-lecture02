import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesTest {
    //File을 보완해서 나온 새로운 클래스
    public static void main(String[] args) {
        Path file = Path.of("temp02/example.txt");
        Path directory =  Path.of("temp02/exampleDir");
        try {
            Files.createFile(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            Files.createDirectory(directory);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        boolean isFile = Files.isRegularFile(file);
        boolean isDirectory = Files.isDirectory(directory);
        System.out.println(isFile?"file":"folder");
        System.out.println(isDirectory?"folder":"file");

        System.out.println(file.getFileName());
        System.out.println(directory.getFileName());

        try {
            System.out.println(file.getFileName()+" file 크기 : "+Files.size(file)+"byte");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //client에서 파일을 전달받고 서버 외부에 저장하는 것이 어려움...
        Path newFile = Paths.get("temp02/newExample.txt");
        try {
            Files.move(file,newFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

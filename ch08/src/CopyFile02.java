import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CopyFile02 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Path origin = Path.of("temp03/copy.dat");
        Path target =  Path.of("temp03/copy_new.dat");
        //컴퓨터에게 맡기는 방법
        try {
            //파일이름이 같을때 덮어써라... 파일업로드 할때 쓴다.  jpg, gif,png
            // a - profile.jpg
            // b - profile.jpg
            // 외부 폴더에다가 옮겨놓기.
            Files.copy(origin,target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("걸린 시간 : "+(endTime - startTime)+"ms");
    }
}

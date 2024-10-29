import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class FilePathTest {
    public static void main(String[] args) {
        File file = new File("temp/..");
        System.out.println("path="+file.getPath());
        //절대경로
        System.out.println("AbsolutePath path="+file.getAbsolutePath());
        try {
            //정규경로
            System.out.println("CanonicalPath path="+file.getCanonicalPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File files[] = file.listFiles();
        System.out.println(files.length);
        for(File f:files) {
            System.out.println( f.isFile()?f.getName()+" : file":f.getName()+" : folder");
        }

        Path path = Path.of("temp/..");
        try {
            System.out.println("path = "+path);
            System.out.println("AbsolutePath path="+path.toAbsolutePath());
            System.out.println("CanonicalPath path="+path.toRealPath());

            //Collection List, Array
            Stream<Path> patehStream = Files.list(path);
            List<Path> pathList = patehStream.toList();
            patehStream.close();
            for(Path p:pathList) {
                System.out.println(Files.isRegularFile(p)?p.getFileName()+" : file":p.getFileName()+" : folder");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

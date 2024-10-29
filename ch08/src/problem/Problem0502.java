package problem;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Problem0502 {
    public static void main(String[] args) {
        Path file01 =  Path.of("temp/elvis01.txt");
        Path file02 =  Path.of("temp/elvis02.txt");
        try {
            boolean isSame = Files.isSameFile(file01,file02);
            if(isSame) System.out.println("같은 파일");
            else System.out.println("다른 파일");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            long num = Files.mismatch(file01,file02);  //같으면 -1을 넘겨준다.
            //처음 만나는 다른 byte의 index값을 리턴한다.
            System.out.println(num);
            if(num==-1) System.out.println("같은 파일");
            else System.out.println("다른 파일");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

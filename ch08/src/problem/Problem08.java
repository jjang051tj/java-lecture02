package problem;

import java.io.File;

public class Problem08 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\tjoeunis205\\Desktop");
        File fileList [] = file.listFiles(); //file을 싹다 읽어 오기...
        //System.out.println(fileList.length);
        long big = 0;
        File bigFile = null;
        for(int i=0;i<fileList.length;i++) {
            File f = fileList[i];
            if(f.isDirectory()) continue;
            long fileSize = f.length();

            if(fileSize>big) {
                big =  fileSize;
                bigFile = f;
            }
        }
        System.out.println("제일 큰 파일은 "+bigFile.getName()+"의 파일 크기 : "+big/1024/1024+"mb 입니다.");
    }
}

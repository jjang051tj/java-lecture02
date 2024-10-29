package problem;

import java.io.File;

public class Problem09 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\tjoeunis205\\Downloads");
        File files[] = file.listFiles();
        System.out.println("jpg를 찾아서 지웁니다");
        int count = 0;
        for(int i=0;i< files.length;i++) {
            File f = files[i];
            if(!f.isFile()) continue;
            String fileName = f.getName(); //fjkdjksfd.txt   fjdksj.jpg
            int idx = fileName.lastIndexOf('.');

            String extention =  fileName.substring(idx+1);
            System.out.println(fileName.substring(0,idx)+" : "+idx+"    확장자는 : "+extention);
            if(extention.equals("msi") || extention.equals("exe")) {
                f.delete();
                count++;
            }
            System.out.println(count+"개의 파일이 지워졌습니다.");
        }
        //여기 안에 파일들 중에 .txt를 찾아서 지운다.
    }
}

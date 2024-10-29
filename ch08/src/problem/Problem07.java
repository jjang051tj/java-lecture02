package problem;

import java.io.*;

public class Problem07 {
    public static void main(String[] args) {
        File sourceFile = new File("temp/jun.jpg");
        File copyFile = new File("temp/jun-copy.jpg");
        try {
            FileInputStream fileInputStream = new FileInputStream(sourceFile);
            FileOutputStream fileOutputStream = new FileOutputStream(copyFile);
            //BufferedInputStream은 보조 스트림 다른스크림을 매개변수로 가진다.
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            //파일의 크기
            long fileSize = sourceFile.length();
            long tenPercnt = fileSize/30;
            long progress = 0;
            System.out.println(sourceFile.getName()+"을 "+copyFile.getName()+"으로 복사합니다");
            byte bytes[] = new byte[1024];
            int num = 0;
            while(true) {
                num = bufferedInputStream.read(bytes,0,bytes.length);
                if(num==-1)  {
                    if(progress>0) {
                        //다 읽었는데 복사가 끝났는데 10퍼센트에 미치지 못해서 별을 못찍는경우 강제로 하나 찍기...
                        System.out.print("* ");
                    }
                    break;
                }
                if(num>0) {
                    bufferedOutputStream.write(bytes,0,num);
                }
                progress+=num;
                if(progress>=tenPercnt) {
                    System.out.print("* ");
                    progress=0;
                }
            }
            bufferedInputStream.close();
            bufferedOutputStream.close();
            fileInputStream.close();
            fileOutputStream.close();
            System.out.println("");
            System.out.println("파일이 복사되었습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

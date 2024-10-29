package problem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Problem05 {
    public static void main(String[] args) {
        File file01 =  new File("temp/elvis01.txt");
        File file02 =  new File("temp/elvis02.txt");
        //텍스트 파일이 아닌 경우
        byte bytes [] = new byte[8];
        try {
            FileInputStream fileInputStream01 = new FileInputStream(file01);
            FileInputStream fileInputStream02 = new FileInputStream(file02);
            int num = 0;
            while(true) {
                num++;
                int byte01,byte02;
                byte01 = fileInputStream01.read();
                byte02 =  fileInputStream02.read();
                if(byte01==-1 || byte02==-1) break;
                if(byte01!=byte02) {
                    System.out.println("다른 파일입니다.");
                } else {
                    System.out.println("같은 파일입니다.");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

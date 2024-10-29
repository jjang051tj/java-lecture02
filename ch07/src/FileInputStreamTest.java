import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamTest {
    public static void main(String[] args) {
        //reader/writer는 문자전용
        try {
            int c = 0;
            //1byte  10100010(8bit)
            //영어는 1byte 만 있어도 가능  2byte 3byte
            FileInputStream fileInputStream = new FileInputStream("temp/sample.txt"); //byte로 문자를 읽겠다
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"UTF-8");
            //EUC-KR 2byte   2 16승  영어/한자
            //UTF-8 4byte    가변
            //1byte  영어, 라틴글자등
            //2byte 그리스어 히브리어
            //3byte 한글, 한자, 일본어, 다른 여러나라 글자
            //4byte 기타등등
            System.out.println(inputStreamReader.getEncoding());
            //영어는 1byte  8bit  256
            //한글  2byte  16bit

            while(true) {
                c = inputStreamReader.read();
                if(c==-1) break;  //EOF  -1
                System.out.print((char)c);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class CalcClient {
    public static void main(String[] args) {
        Socket socket = null;
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bufferedWriter = null;
        BufferedReader bufferedReader = null;
        try {
            socket = new Socket("127.0.0.1",9998);
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                System.out.print("계산을 해드립니다. 띄어쓰기 해서 보네세요. ex) 3 + 2 ");
                String outputMsg = scanner.nextLine();
                if(outputMsg.equals("end"))  break;
                bufferedWriter.write(outputMsg+"\r\n");
                bufferedWriter.flush(); // 꽉 안차더라도 남아 있는게 있으면 보내라...
                String inputMsg =  bufferedReader.readLine();
                System.out.println("계산결과 : "+inputMsg);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

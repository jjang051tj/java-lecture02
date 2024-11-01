import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest {
    public static void main(String[] args) {
        Socket socket = null;
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bufferedWriter = null;
        BufferedReader bufferedReader = null;
        try {
            socket = new Socket("127.0.0.1",9999);
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                System.out.println("보내기 >> ");
                String outputMsg = scanner.nextLine();
                if(outputMsg.equals("end"))  break;
                bufferedWriter.write(outputMsg+"\r\n");
                bufferedWriter.flush(); // 꽉 안차더라도 남아 있는게 있으면 보내라...
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

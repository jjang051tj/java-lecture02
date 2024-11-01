import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
    public static void main(String[] args) {
        //port
        ServerSocket listener=null;
        Socket socket = null;
        BufferedWriter bufferedWriter = null;
        BufferedReader bufferedReader = null;
        try {
            listener = new ServerSocket(9999); //개구멍이다. port가 맞아야지 들어올 수 있다.
            System.out.println("외부에서 들어오는 socket 연결대기중");
            socket = listener.accept(); //외부에서 들어오는 socket
            System.out.println("연결되었습니다.");
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                String inputMsg = bufferedReader.readLine();
                if(inputMsg.equals("end")) break;
                System.out.println("클라이언트에서 보낸 메세지  >> "+inputMsg);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

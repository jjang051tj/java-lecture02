package chat02.v3;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import static utils.MyLogger.log;

public class ClientV0302 {
    private static final int PORT = 12345;
    public static void main(String[] args) throws IOException {
        //쓰레드를 하나 만들어야 한다. 이떼 session이라고 한다.
        log("클라이언트 시작");
        Socket socket = new Socket("127.0.0.1",PORT);
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        log("소켓 연결");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            //서버로 문자 보내기
            System.out.print("전송 문자 : ");
            String toSend = scanner.nextLine();
            dataOutputStream.writeUTF(toSend); //스트링 형식으로 데이터를
            log("client => server : "+toSend);
            if(toSend.equalsIgnoreCase("exit")) {
                break;
            }
            //서버로 부터 받은 문자
            String received = dataInputStream.readUTF();
            log("client <= server : "+received);
        }
        //자원회수
        log("연결 종료");
        dataInputStream.close();
        dataOutputStream.close();
        socket.close();
    }
}
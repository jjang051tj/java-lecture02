package chat02.v2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static utils.MyLogger.log;

public class ServerV01 {
    private static final int PORT = 12345; // 1~1000는 쓰지 않는다.
    public static void main(String[] args) throws IOException {
        log("서버시작");
        ServerSocket serverSocket= new ServerSocket(PORT);
        log("서버 소켓 시작 - listenning port"+PORT);
        Socket socket = serverSocket.accept();
        log("소켓 연결 : "+socket);

        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
        String received =  dataInputStream.readUTF();
        log("client => server : "+received);
        String toSend =  received+ "World";
        dataOutputStream.writeUTF(toSend);
        log("server => client : "+toSend);
        // 여름 해수욕장 1000 1 ==> 1, 2 ==> 2, 1000 ==> 1000 유동ip

        //자원회수
        log("연결 종료 : "+socket);
        dataInputStream.close();
        dataOutputStream.close();
        socket.close();
        serverSocket.close();
    }
}

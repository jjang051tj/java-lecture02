package chat02.v4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static utils.MyLogger.log;

public class ServerV04 {
    private static final int PORT = 12345; // 1~1000는 쓰지 않는다.

    public static void main(String[] args) throws IOException {
        log("서버시작");
        ServerSocket serverSocket = new ServerSocket(PORT);
        log("서버 소켓 시작 - listenning port" + PORT);
        while (true) {
            Socket socket = serverSocket.accept();
            log("소켓 연결 : "+socket);
            SessionV4 session = new SessionV4(socket);
            Thread thread = new Thread(session);
            thread.start();
        }
    }
}

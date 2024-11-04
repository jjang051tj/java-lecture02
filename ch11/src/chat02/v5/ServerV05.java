package chat02.v5;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static utils.MyLogger.log;

public class ServerV05 {
    private static final int PORT = 12345; // 1~1000는 쓰지 않는다.


    public static void main(String[] args) throws IOException {
        log("서버시작");
        SessionManagerV5 sessionManager = new SessionManagerV5();
        ServerSocket serverSocket = new ServerSocket(PORT);
        log("서버 소켓 시작 - listenning port" + PORT);
        ShutdownHook shutdownHook = new ShutdownHook(serverSocket,sessionManager);
        Runtime.getRuntime().addShutdownHook(new Thread(shutdownHook,"shutdown"));
        try {
            while (true) {
                Socket socket = serverSocket.accept();
                log("소켓 연결 : " + socket);
                SessionV5 session = new SessionV5(socket, sessionManager);
                Thread thread = new Thread(session);
                thread.start();
            }
        } catch (IOException e) {
            log("사버 소케 종료 : "+e);
        }
    }
    static class ShutdownHook implements Runnable {
        private final ServerSocket serverSocket;
        private final SessionManagerV5 sessionManager;

        public ShutdownHook(ServerSocket serverSocket, SessionManagerV5 sessionManager) {
            this.serverSocket = serverSocket;
            this.sessionManager = sessionManager;
        }

        @Override
        public void run() {
            log("shutdown hook 실행");
            try {
                sessionManager.closeAll();
                serverSocket.close();
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("e === "+e);
            }
        }
    }
}

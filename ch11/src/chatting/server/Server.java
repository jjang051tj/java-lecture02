package chatting.server;

import utils.MyLogger;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static utils.MyLogger.log;

public class Server {
    private final int port;
    private final CommandManager commandManager;
    private final SessionManager sessionManager;
    private ServerSocket serverSocket;


    public Server(int port, CommandManager commandManager, SessionManager sessionManager) {
        this.port = port;
        this.commandManager = commandManager;
        this.sessionManager = sessionManager;
    }

    public void start() throws IOException {
        log("서버 시작 : " + commandManager.getClass());
        serverSocket = new ServerSocket(port);
        log("서버 소켓 시작 - 리스닝 포트 : " + port);
        running();
    }

    private void running() {


        try {
            while (true) {
                Socket socket = serverSocket.accept();
                log("소켓 연결 : "+socket);
                Session session = new Session(socket, commandManager, sessionManager);
                Thread thread = new Thread(session);
                thread.start();
            }
        } catch (IOException e) {
            log("서버 소켓 종료 : "+e);
        }
    }
}

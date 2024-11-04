package chatting.server;

import chat02.SocketClose;
import chat02.v5.SessionManagerV5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

import static utils.MyLogger.log;

public class Session implements Runnable {
    private final Socket socket;
    private final DataInputStream input;
    private final DataOutputStream output;
    private final SessionManager sessionManager;
    private final CommandManager commandManager;

    private boolean closed = false;
    private String userName;

    public Session(Socket socket, CommandManager commandManager, SessionManager sessionManager) throws IOException {
        this.socket = socket;
        this.commandManager = commandManager;
        this.sessionManager = sessionManager;
        output = new DataOutputStream(socket.getOutputStream());
        input = new DataInputStream(socket.getInputStream());
        sessionManager.add(this); //생성되자 마자 sessionManager에 등록
    }

    //이름 얻어오기
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void send(String message) throws IOException {
        log("server ==> client : " + message);
        output.writeUTF(message);
    }


    @Override
    public void run() {
        try {
            while (true) {
                String received = input.readUTF();
                log("client ==> server : "+received);
                commandManager.execute(received,this);
            }
        } catch (IOException e) {
            log(e);
        } finally {
            sessionManager.remove(this);
            sessionManager.sendAll(userName+"님이 퇴장하였습니다.");
            close();
        }
    }

    public void close() {
        if (closed) return;
        SocketClose.closeAll(socket, input, output);
        closed = true;
        log("연결 종료 : " + socket);
    }
}

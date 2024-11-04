package chat02.v5;

import chat02.SocketClose;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import static utils.MyLogger.log;

public class SessionV5 implements Runnable {
    private final Socket socket;
    private boolean closed = false;
    private final DataOutputStream dataOutputStream;
    private final DataInputStream dataInputStream;
    private final SessionManagerV5 sessionManager;
    public SessionV5(Socket socket,SessionManagerV5 sessionManager) throws IOException {
        this.socket = socket;
        this.dataInputStream = new DataInputStream(socket.getInputStream());
        this.dataOutputStream = new DataOutputStream(socket.getOutputStream());

        this.sessionManager = sessionManager;
        this.sessionManager.add(this);
    }

    @Override
    public void run() {

        try {
            while (true) {
                String received = dataInputStream.readUTF();
                log("client => server : " + received);
                if (received.equalsIgnoreCase("exit")) {
                    break;
                }
                String toSend = received + "World";
                dataOutputStream.writeUTF(toSend);
                log("client <= server : " + toSend);
            }
            log("연결 종료 : " + socket);
        } catch (IOException e) {
            log(e);
        } finally {
            sessionManager.remove(this);
        }
    }
    //server socket  - socket
    //server socket  - ssession

    public synchronized void close() {
        if(closed) {
            return;
        }
        SocketClose.closeAll(socket,dataInputStream,dataOutputStream);
        closed=true;
        log("연결 종료 : "+socket);
    }
}

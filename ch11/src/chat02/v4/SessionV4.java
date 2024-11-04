package chat02.v4;

import chat02.SocketClose;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import static utils.MyLogger.log;

public class SessionV4 implements Runnable {
    private final Socket socket;

    public SessionV4(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        DataOutputStream dataOutputStream = null;
        DataInputStream dataInputStream = null;
        try {
            dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dataInputStream = new DataInputStream(socket.getInputStream());
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
            //자원회수
            log("연결 종료 : " + socket);
            dataInputStream.close();
            dataOutputStream.close();
            socket.close();
        } catch (IOException e) {
            log(e);
        } finally {
            SocketClose.closeAll(socket,dataInputStream, dataOutputStream);
        }
    }
}

package chat02.v3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import static utils.MyLogger.log;

public class SessionV3 implements Runnable {
    private final Socket socket;

    public SessionV3(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
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
            throw new RuntimeException(e);
        }
    }
}

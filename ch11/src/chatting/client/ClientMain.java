package chatting.client;

import java.io.IOException;

public class ClientMain {
    private static final int PORT = 12345;
    public static void main(String[] args) throws IOException {
        Client client = new Client("127.0.0.1",PORT);
        client.start();
    }
    //서버쪽 코드는 밥먹고와서...
}

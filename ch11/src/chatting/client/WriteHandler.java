package chatting.client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

import static utils.MyLogger.log;


public class WriteHandler implements Runnable {

    private static final String DELIMETER = "|";
    private final Client client;
    private final DataOutputStream output;  //spring
    public boolean closed = false;

    public WriteHandler(Client client, DataOutputStream output) {
        this.client = client;
        this.output = output;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        try {
            String userName = inputUserName(scanner);
            output.writeUTF("/join" + DELIMETER + userName); //처음 접속했을때 무조건 이름쓰고 들어오게 만든다.
            while (true) {
                String toSend = scanner.nextLine();
                if (toSend.isEmpty()) {
                    continue;
                }
                if (toSend.equalsIgnoreCase("/exit")) {
                    output.writeUTF(toSend);
                    break;
                }
                if(toSend.startsWith("/")) {
                    output.writeUTF(toSend);
                } else {
                    output.writeUTF("/message"+DELIMETER+toSend);
                }
            }
        } catch (IOException e) {
            log(e);
        } finally {
            client.close();
        }
    }

    private static String inputUserName(Scanner scanner) {
        System.out.println("이름을 입력하세요.");
        String userName;
        do {
            userName = scanner.nextLine();
        } while (userName.isEmpty());
        return userName;
    }
    public synchronized void close() {
        if(closed) return;
        try {
            System.in.close();
        } catch (IOException e) {
            log(e);
        }
        closed=true;
        log("writeHandler 종료");
    }
}

package chatting.server;

import java.io.IOException;

public class CommandManagerV1 implements CommandManager {
    private final SessionManager sessionManager;

    public CommandManagerV1(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    @Override
    public void execute(String message, Session session) throws IOException {
        //무조건 메세지 송출
        if(message.startsWith("/exit"))  {
            throw  new IOException("exit");
        }
        sessionManager.sendAll(message);
    }
}
//ServerSocket Socket  1 : 다
// socket session;
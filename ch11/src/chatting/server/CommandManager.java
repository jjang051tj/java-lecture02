package chatting.server;

import java.io.IOException;

public interface CommandManager {
    void execute(String message,Session session) throws IOException;
}

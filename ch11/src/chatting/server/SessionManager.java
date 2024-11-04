package chatting.server;

//session 서버로 연결시도한 socket 을 이용해서 session을 만들었고 이걸 관리하는 SessionManager

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static utils.MyLogger.log;
import java.util.function.Consumer;

public class SessionManager {
    private List<Session> sessions = new ArrayList<>();
    // 하나 추가
    public synchronized void add(Session session) {
        sessions.add(session);
    }
    // 하나 제거
    public synchronized void remove(Session session) {
        sessions.remove(session);
    }
    // 전부닫고 제거하기
    public synchronized void closeAll() {
        /*
        for(Session session : sessions) {
            session.close();
        }
        */
        sessions.forEach(session -> session.close());
        sessions.clear();
    }
    public synchronized void sendAll(String message) {
        sessions.forEach(session -> {
            try {
                session.send(message);
            } catch (IOException e) {
                log(e);
            }
        });
        sessions.clear();
    }
    public synchronized List<String> getAllUserName() {
        List<String> userNames =  new ArrayList<>();
        sessions.forEach(session -> {
            userNames.add(session.getUserName());
        });
        return userNames;
    }
}

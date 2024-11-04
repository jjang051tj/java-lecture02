package chatting.server;

import java.io.IOException;
import java.util.List;

public class CommandManagerV2 implements CommandManager {
    private final SessionManager sessionManager;
    private static final String DELIMETER = "\\|";

    public CommandManagerV2(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }


    //서버에서 전체 client로 던지는 곳
    @Override
    public void execute(String totalMessage, Session session) throws IOException {
        //무조건 메세지 송출
        if(totalMessage.startsWith("/join")) {
            String split[] = totalMessage.split(DELIMETER);
            String userName =  split[1];
            session.setUserName(userName);
            sessionManager.sendAll(userName+"님이 입장했습니다. 두둥탁");
        } else if(totalMessage.startsWith("/message")) {
            String split[] = totalMessage.split(DELIMETER);
            String message =  split[1];
            sessionManager.sendAll("["+session.getUserName()+"] "+message);
        } else if(totalMessage.startsWith("/change")) {
            ///change|장성호
            String split[] = totalMessage.split(" ");
            String changeName =  split[1];
            sessionManager.sendAll(session.getUserName()+"님이 "+changeName+"로 이름을 변경하였습니다.");
            session.setUserName(changeName);
        } else if(totalMessage.startsWith("/users")) {
            List<String> userNames  = sessionManager.getAllUserName();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("전체 접속자 수 : ").append(userNames.size()).append("\r\n");
            userNames.forEach(userName->stringBuilder.append(" - ").append(userName).append("\r\n"));
            session.send(stringBuilder.toString());
        } else if(totalMessage.startsWith("/exit"))  {
            throw  new IOException("exit");
        } else {
            session.send("처리할 수 없는 명령어입니다.");
        }

    }
}
//ServerSocket Socket  1 : 다
// socket session;
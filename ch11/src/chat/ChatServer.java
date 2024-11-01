package chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

public class ChatServer {
    private static final int PORT = 9997;
    public static void main(String[] args) {
        try {
            System.out.println("chatting server start >>> ");
            ServerSocket serverSocket = new ServerSocket(PORT);
            //접속해 오는 여러 clinet를 계속 받아주는 thread
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static class ChatClientHandler implements Runnable {
        private Socket socket;
        private BufferedWriter bufferedWriter;
        private BufferedReader bufferedReader;

        private Set<BufferedWriter> clientWriters = new HashSet<>();

        public ChatClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                clientWriters.add(bufferedWriter);
                String message = bufferedReader.readLine();
                while(message!=null) {
                    System.out.println("받은 메세지 : "+message);
                    broadcast(message);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        private void broadcast(String message) {
            for(BufferedWriter writer : clientWriters) {
                try {
                    writer.write(message);
                    writer.newLine();
                    writer.flush();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

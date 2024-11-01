package chat;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
    private static final int PORT = 12345;
    private static Set<BufferedWriter> clientWriters = new HashSet<>();

    public static void main(String[] args) {
        System.out.println("채팅 서버 시작...");
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            while (true) {
                new Thread(new ClientHandler(serverSocket.accept())).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class ClientHandler implements Runnable {
        private Socket socket;
        private BufferedWriter out;
        private BufferedReader in;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                addClientWriter(out);

                String message;
                while ((message = in.readLine()) != null) {
                    System.out.println("받은 메시지: " + message);
                    broadcast(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                removeClientWriter(out);
            }
        }

        private void broadcast(String message) {

                for (BufferedWriter writer : clientWriters) {
                    try {
                        writer.write(message);
                        writer.newLine();
                        writer.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

        }

        private void addClientWriter(BufferedWriter writer) {
            synchronized (clientWriters) {
                clientWriters.add(writer);
            }
        }

        private void removeClientWriter(BufferedWriter writer) {
            synchronized (clientWriters) {
                clientWriters.remove(writer);
            }
        }
    }
}

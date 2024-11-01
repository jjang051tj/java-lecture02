package chat;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatClient {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12345;

    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT)) {
            new Thread(new ReadThread(socket)).start();
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String message = scanner.nextLine();
                out.write(message);
                out.newLine();
                out.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class ReadThread implements Runnable {
        private BufferedReader in;

        public ReadThread(Socket socket) {
            try {
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            try {
                String message;
                while ((message = in.readLine()) != null) {
                    System.out.println("수신된 메시지: " + message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

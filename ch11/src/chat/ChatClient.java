package chat;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1",9997);
            Thread thread = new Thread(new ReadThread(socket));
            thread.start();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            Scanner scanner = new Scanner(System.in);
            while(true) {
                String message = scanner.nextLine();
                bufferedWriter.write(message);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static class ReadThread implements Runnable {
        private BufferedReader bufferedReader=null;

        public ReadThread(Socket socket) {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void run() {
            try {
                String message = bufferedReader.readLine();
                while (message!=null) {
                    System.out.println("수신된 메세지 : "+ message);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

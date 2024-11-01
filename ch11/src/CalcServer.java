import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

public class CalcServer {
    public static void main(String[] args) {
        ServerSocket listener = null;
        Socket client = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            listener = new ServerSocket(9998);
            System.out.println("연결을 기다리고 있습니다.");
            client = listener.accept();
            bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            while (true) {
                String inputMsg = bufferedReader.readLine();
                if (inputMsg.equalsIgnoreCase("end")) break;
                System.out.println(inputMsg);
                StringTokenizer stringTokenizer = new StringTokenizer(inputMsg, " ");
                if (stringTokenizer.countTokens() != 3) {
                    System.out.println("error");
                } else {
                    int num01 = Integer.parseInt(stringTokenizer.nextToken());
                    String operator = stringTokenizer.nextToken();
                    int num02 = Integer.parseInt(stringTokenizer.nextToken());
                    int result = 0;
                    if (operator.equalsIgnoreCase("+")) result = num01 + num02;
                    else if (operator.equalsIgnoreCase("-")) result = num01 - num02;
                    else if (operator.equalsIgnoreCase("*")) result = num01 * num02;
                    else if (operator.equalsIgnoreCase("/")) result = num01 / num02;
                    bufferedWriter.write(Integer.toString(result));
                    bufferedWriter.write("\r\n");
                    bufferedWriter.flush();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        //new Scanner(System.in); //메모리에 Scanner라는 객체를 하나 올린다.
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextInt();
        //System.out.println("입력받은 숫자는 "+num+"입니다.");
        System.out.printf("입력받은 숫자는 %f",num);

    }
}

import java.util.Scanner;

public class ScannerString {
    public static void main(String[] args) {
        System.out.println("이름을 입력해주세요");
        Scanner scanner = new Scanner(System.in);
        int age  = scanner.nextInt();
        if(age>20) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }
//        String name = scanner.next();
//        String name02 = scanner.next();
//        String name03 = scanner.next();
//        System.out.println("이름은 "+name+"입니다.");
//        System.out.println("이름은 "+name02+"입니다.");
//        System.out.println("이름은 "+name03+"입니다.");
        //숫자하나를 입력받아서 20보다 크면  성인입니다. 출력 아니면 미성년자입니다. 출력
    }
}

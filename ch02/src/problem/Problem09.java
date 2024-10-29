package problem;

import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strArr[] =  {"가위","바위","보"};
        while(true) {
            System.out.println("가위/바위/보를 써주세요.");
            String manChoice = scanner.nextLine();
            int random = (int)(Math.random()*3); //0,1,2
            System.out.printf("나의 선택은 %s, 컴퓨터의 선택은 %s \t",manChoice,strArr[random]);
            //승패 출력해주세요.
            String computerChoice = strArr[random];
            if(manChoice.equals("가위") && computerChoice.equals("보")    ||
               manChoice.equals("바위") && computerChoice.equals("가위")  ||
                    manChoice.equals("보") && computerChoice.equals("바위") ) {
                System.out.println("당신이 이겼습니다.");
            } else if(manChoice.equals("가위") && computerChoice.equals("바위")    ||
                    manChoice.equals("바위") && computerChoice.equals("보")  ||
                    manChoice.equals("보") && computerChoice.equals("가위") ) {
                System.out.println("당신이 졌습니다.");
            } else {
                System.out.println("당신이 비겼습니다.");
            }
            System.out.println();
            if(manChoice.equals("그만")) {
                break;
            }
        }
    }
}

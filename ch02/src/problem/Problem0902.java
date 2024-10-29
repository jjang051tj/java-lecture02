package problem;


import java.util.Scanner;

public class Problem0902 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strArr[] = {"가위", "바위", "보"};
        while (true) {
            System.out.println("가위/바위/보를 써주세요.");
            String manChoice = scanner.nextLine();
            int random = (int) (Math.random() * 3); //0,1,2

            //승패 출력해주세요.
            String computerChoice = strArr[random];
            //비기는 경우
            // 0~5 이기는 경우
            // 5~8 비기는 경우
            // 진
            String result = "";
            if (Math.random() >= 0 && Math.random() < 0.5) {
                if (manChoice.equals("가위")) {
                    random = 1;
                    System.out.printf("나의 선택은 %s, 컴퓨터의 선택은 %s \t", manChoice, strArr[random]);
                    System.out.println("당신이 졌습니다.");
                } else if (manChoice.equals("바위")) {
                    random = 2;
                    System.out.printf("나의 선택은 %s, 컴퓨터의 선택은 %s \t", manChoice, strArr[random]);
                    System.out.println("당신이 졌습니다.");
                } else if (manChoice.equals("보")) {
                    random = 0;
                    System.out.printf("나의 선택은 %s, 컴퓨터의 선택은 %s \t", manChoice, strArr[random]);
                    System.out.println("당신이 졌습니다.");
                }
            } else if (Math.random() >= 0.5 && Math.random() < 0.8) {
                if (manChoice.equals("가위")) {
                    random = 0;
                    System.out.printf("나의 선택은 %s, 컴퓨터의 선택은 %s \t", manChoice, strArr[random]);
                    System.out.println("비겼습니다.");
                } else if (manChoice.equals("바위")) {
                    random = 1;
                    System.out.printf("나의 선택은 %s, 컴퓨터의 선택은 %s \t", manChoice, strArr[random]);
                    System.out.println("비겼습니다.");
                } else if (manChoice.equals("보")) {
                    random = 2;
                    System.out.printf("나의 선택은 %s, 컴퓨터의 선택은 %s \t", manChoice, strArr[random]);
                    System.out.println("비겼습니다.");
                }
            } else {
                if (manChoice.equals("가위")) {
                    random = 2;
                    System.out.printf("나의 선택은 %s, 컴퓨터의 선택은 %s \t", manChoice, strArr[random]);
                    System.out.println("당신이 이겼습니다.");
                } else if (manChoice.equals("바위")) {
                    random = 0;
                    System.out.printf("나의 선택은 %s, 컴퓨터의 선택은 %s \t", manChoice, strArr[random]);
                    System.out.println("당신이 이겼습니다.");
                } else if (manChoice.equals("보")) {
                    random = 1;
                    System.out.printf("나의 선택은 %s, 컴퓨터의 선택은 %s \t", manChoice, strArr[random]);
                    System.out.println("당신이 이겼습니다.");
                }
            }
            System.out.println();
            if (manChoice.equals("그만")) {
                break;
            }
        }
    }
}


package problem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        ArrayList<Nation> arrayList = new ArrayList<>();
        arrayList.add(new Nation("서울","한국"));
        arrayList.add(new Nation("워싱턴","미국"));
        arrayList.add(new Nation("도쿄","일본"));
        arrayList.add(new Nation("베이징","중국"));
        arrayList.add(new Nation("캔버라","호주"));
        arrayList.add(new Nation("모스크바","러시아"));
        arrayList.add(new Nation("오타와","캐나다"));
        arrayList.add(new Nation("런던","영국"));
        int total = arrayList.size();
        Scanner scanner = new Scanner(System.in);
        System.out.println("나라이름 맞추기 게임");
        while(true) {
            Random random = new Random();
            int randomNum = random.nextInt(total);  //0~9
            System.out.println(arrayList.get(randomNum).getCountry()+"의 수도는 ?");
            String answer = scanner.nextLine();
            if(answer.equals("그만")) break;
            String capital = arrayList.get(randomNum).getCapital();
            if(answer.equals(capital)) System.out.println("정답");
            else System.out.println("땡");
        }
    }
}

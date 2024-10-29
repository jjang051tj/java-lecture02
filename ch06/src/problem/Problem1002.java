package problem;

import java.util.*;

public class Problem1002 {
    public static void main(String[] args) {
        HashMap<String,Nation> hashMap = new HashMap<>();
        hashMap.put("서울",new Nation("서울","한국"));
        hashMap.put("워싱턴",new Nation("워싱턴","미국"));
        hashMap.put("도쿄",new Nation("도쿄","일본"));
        hashMap.put("베이징",new Nation("베이징","중국"));
        hashMap.put("캔버라",new Nation("캔버라","호주"));
        hashMap.put("모스크바",new Nation("모스크바","러시아"));
        hashMap.put("오타와",new Nation("오타와","캐나다"));
        hashMap.put("런던",new Nation("런던","영국"));

        int total = hashMap.size();
        Set<String> keySet = hashMap.keySet();
        Object array[] = keySet.toArray();
//        System.out.println(Arrays.toString(array));
//        for(int i=0;i<array.length;i++) {
//            System.out.println(array[i]);
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("나라이름 맞추기 게임");
        while(true) {
            Random random = new Random();
            int randomNum = random.nextInt(total);  //0~9  8
            System.out.println(hashMap.get(array[randomNum]).getCountry()+"의 수도는 ?");
            String answer = scanner.nextLine();
            if(answer.equals("그만")) break;
            String capital = hashMap.get(array[randomNum]).getCapital();
            if(answer.equals(capital)) System.out.println("정답");
            else System.out.println("땡");
        }
    }
}

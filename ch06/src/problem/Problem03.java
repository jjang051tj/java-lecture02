package problem;

import java.util.HashMap;
import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        HashMap<String, Integer> countryList = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("나라와 인구수를 입력하세요. ex) Korea 5000");
        while(true) {
            String country = scanner.next();
            if(country.equals("그만")) break;
            int population = scanner.nextInt();
            countryList.put(country,population);

        }
//        countryList.put("Korea",5000);
//        countryList.put("France",12000);
//        countryList.put("China",100000);
//        countryList.put("America",30000);
        System.out.println("나라 이름을 입력하세요");
        while(true) {
            String country = scanner.next();
            if(country.equals("그만")) break;
            Integer population = countryList.get(country);
            if(population==null) System.out.println("나라 이름이 없습니다.");
            System.out.println(country+"의 인구는 "+population);
        }
        System.out.println(countryList.get("Korea"));
    }
}

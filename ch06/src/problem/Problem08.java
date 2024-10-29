package problem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Problem08 {
    public static void main(String[] args) {
        HashMap<String,Customer> hashMap = new HashMap<>();
        hashMap.put("장성호",new Customer("장성호",100));
        hashMap.put("장동건",new Customer("장동건",100));
        hashMap.put("정형돈",new Customer("정형돈",100));
        hashMap.put("유재석",new Customer("유재석",100));
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("이름과 포인트 입력");//장성호 20
            String str = scanner.next();
            if(str.equals("그만")) break;
            int point = scanner.nextInt();
            Customer customer = hashMap.get(str);
            int customerPoint = customer.getPoint();
            customerPoint+=point;
            hashMap.put(str, new Customer(str,customerPoint));
            showAll(hashMap);
        }
    }

    private static void showAll(HashMap<String, Customer> hashMap) {
        Set<String> keySet =  hashMap.keySet();
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()) {
            System.out.println(hashMap.get(iterator.next()));
        }
    }
}

package problem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Problem07 {
    public static void main(String[] args) {
        HashMap<String, Student> hashMap = new HashMap<>();
        hashMap.put("장성호", new Student("장성호", 3.5));
        hashMap.put("장동건", new Student("장동건", 4.2));
        hashMap.put("정형돈", new Student("정형돈", 2.3));
        hashMap.put("유재석", new Student("유재석", 3.75));

        Set<String> keySet = hashMap.keySet();
        Iterator<String> iterator = keySet.iterator();
        double scholarShip = 4;

        extracted(iterator, hashMap, scholarShip);
    }

    private static void extracted(Iterator<String> iterator, HashMap<String, Student> hashMap, double scholarShip) {
        while (iterator.hasNext()) {
            Student student = hashMap.get(iterator.next());
            if(student.getScore()>= scholarShip) {
                //System.out.println(hashMap.get(iterator.next()));
                System.out.println(student);
            }
        }
    }
}

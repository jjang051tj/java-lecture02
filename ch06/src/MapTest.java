import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("apple","사과");
        map.put("banana","바나나");
        map.put("grape","포도");
        map.put("apple","황금사과");
        //키는 중복 불가능
        System.out.println(map.get("grape"));
        System.out.println(map.get("apple"));
        System.out.println(map.size());
        System.out.println(map.keySet()); //map.keySet의 리턴 값이 Set
        System.out.println("===========");
        System.out.println(map.values()); //map.keySet의 리턴 값이 Set
        System.out.println("===========");
        for(String value:map.values()) {
            System.out.println(value);
        }

        for(String key:map.keySet()) {
            System.out.println(key+map.get(key));
        }

        for(Map.Entry<String, String> entry:map.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }


//        Set<String> keyList = map.keySet();
//        String keyArray[] = keyList.toArray(new String[0]);
//        for(int i=0;i<keyArray.length;i++) {
//            System.out.println(map.get(keyArray[i]));
//        }
    }
}

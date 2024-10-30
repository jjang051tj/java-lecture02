import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

@FunctionalInterface
interface MyFunction02 {
    int max(int a, int b);
}
class AA implements MyFunction02 {

    @Override
    public int max(int a, int b) {
        return 0;
    }
}
//인터페이스 안에 메서드가 하나만 존재한다면 골라서 쓰는게 아니라 그것만 쓸 수 있다.
public class Review {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.max(10,20);
        MyFunction02 f = (a, b) -> a > b ? a : b;
        int value = f.max(10,20);
        System.out.println(value);
        Supplier<Integer> supplier =  () -> (int)(Math.random()*100)+1;
        int randomNum = supplier.get();
        System.out.println(randomNum);

        List<String> names = Arrays.asList("Alice","Bob","Charlie");
        for(int i=0;i< names.size();i++){
            System.out.println(names.get(i));
        }

        names.forEach((String s) -> System.out.println(s));
        ArrayList<Integer> intList = new ArrayList<>();
        for(int i=0;i<10;i++) {
            intList.add(i);
        }
        intList.removeIf(i -> i%2==0 || i%3==0);
        System.out.println(intList);
        intList.replaceAll(i -> i*10);
        System.out.println(intList);

        // Colletion  Stream


    }
    //함수형 인터페이스를 자바에서 제공
    // Runnable 매개변수도 없고 반환값도 없다.        void run();
    // Supplier 메게변수는 없고 반환값만 있다.        <T> get();
    // Consumer 매개변수는 있고 반환값이 없다.        void accept(T t)
    // Function 하나의 매개변수를 받아서 결과 반환     apply(T t)
    // Predicate 매개변수는 하나 반환타입은 boolean   boolean test(T t)

    // Collection  List(ArrayList,Vector) / Map(HashMap) / Set(HashSet)



}

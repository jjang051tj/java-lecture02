import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functional02 {
    public static void main(String[] args) {
        //자바에서 제공하는 함수형 인테페이스들
        //1. Supplier  get()  매개변수는 없고 반환값만 있음
        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * 100) + 1;
            }
        };
        System.out.println(supplier.get());
        //람다식으로 변환
        Supplier<Integer> lamdaSupplier = () -> (int) (Math.random() * 100) + 1;
        System.out.println(lamdaSupplier.get());

        //2. Consumer 매개변수는 있고 반환값만 없음.
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("매개변수로 주어진 정수는 " + integer);
            }
        };
        consumer.accept(10);
        Consumer<Integer> lamdaConsumer = integer -> System.out.println("매개변수로 주어진 정수는 " + integer);
        lamdaConsumer.accept(100);

        //3. Predicate 매개변수는 하나이고 반환타입은 boolean
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 10 ? true : false;
            }
        };
        predicate.test(10);
        Predicate<Integer> lamdaPredicate = integer ->  integer > 10;
        System.out.println(lamdaPredicate.test(100)?"100은 10보다 큽니다.":"100은 10보다 작습니다.");


        //4.    Runnable 매개변수도 없고 반화값도 없음
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("run run run");
            }
        };

        Runnable lamdaRunnable = ()-> System.out.println("lamda run run run");
        runnable.run();
        lamdaRunnable.run();

        //5. Function<T,R> 일반적인 함수 하나의 변수를 받아서 결과 반환
        Function<Integer, Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer/10*10;
            }
        };
        System.out.println(function.apply(109));

        Function<Integer,Integer> lamdaFunction  = (integer)-> integer/10*10;
        System.out.println(lamdaFunction.apply(98));
    }
}

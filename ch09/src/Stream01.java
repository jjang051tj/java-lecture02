import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Stream01 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,1,2,3,6,7,8,9,10);
        Stream<Integer> intStream = list.stream();
//        intStream.distinct().forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer+",");
//            }
//        });
        intStream.distinct().forEach(integer -> {
            System.out.print(integer+",");
        });
        //Stream은 중간연산(리턴값이 stream) 메서드 체이닝
        // 최종연산을 제공
        Stream<String> strStream = Stream.of(new String[]{"a","b","c"});
        Stream<Integer> evenStream =  Stream.iterate(0,n -> n+2).limit(100);
        evenStream.forEach(integer -> {
            System.out.println(integer);
        });

        Stream<Double> doubleStream = Stream.generate(new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        }).limit(10);
        doubleStream.forEach(doubleNum->{
            System.out.println(doubleNum);
        });


        //Stream을 만들면 중간 연산 최종연산을 수행하여 여러 다양한 작업들이 가능하다...
    }
}

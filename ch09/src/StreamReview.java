import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamReview {
    public static void main(String[] args) {
        //순회가능한것들    array,collection
        List<Integer> list01 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list01);
        Stream<Integer> intStream = list01.stream();  //컬렉션에서 stream 생성

        String nameArray[] = {"장성호", "장동건", "정형돈"};
        Stream<String> nameStream = Arrays.stream(nameArray); // 배열 가지고 stream생성

        Stream<String> mudo = Stream.of("유재석", "정준하", "노홍철"); //Stream의 메서드 크기가 정해진것들
        Stream<Integer> integerStream = Stream.iterate(0, i -> i + 2).limit(100); //무한 스트림
        //Stream<Double> doubleStream =  Stream.generate(()->Math.random()); //무한 스트림  메서드참조 람다식
        Stream<Double> doubleStream = Stream.generate(Math::random); //무한 스트림  메서드참조 람다식
//        integerStream.forEach((Integer integer) -> {
//                    System.out.println(integer);
//                }
//        );
        integerStream.forEach(System.out::println);
        //Stream은 중간연산(Stream을 리턴하기 때문에 메서드 체이닝으로 처리 가능하다.)과 최종연산을 제공한다.

    }
}

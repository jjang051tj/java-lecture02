import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.*;
import java.util.stream.*;

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

        IntStream intStream02 = new Random().ints(1, 46); //무한 스트림
        intStream02.distinct().limit(6).sorted().forEach(i -> {
            System.out.print(i + "/");
        });

        //IntStream
        //DoubleStream
        //LongStream
        IntStream intStream03 = new Random().ints(6, 1, 46); //

        IntStream intStream04 = IntStream.of(1, 1, 1, 2, 3, 4, 4, 2, 3, 4, 5, 7, 8, 2, 3, 4, 5, 1);
        System.out.println();
        intStream04.distinct().filter(i -> i % 2 == 0).filter(i -> i <= 4).forEach(System.out::print);

        //filter 거르기
        //map 바꾸기
        List<String> nameList =  Arrays.asList("alice","bob","tom","jerry");
        List<String> upperedNameList = nameList.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
        upperedNameList.forEach(System.out::println);

        //1,2,3,4,5  를 요소로 가지는 리스트를 제곱리스트로 바꿔보기..

        List<Integer> integerList02 = Arrays.asList(1,2,3,4,5);
        List<Integer> squreList = integerList02.stream().map(i -> i*i).collect(Collectors.toList());
        squreList.forEach(System.out::println);

        //"tom","jerry","ninomous kaiser soje"을 리스트로 가지는 곳에서 이름의 길이를 가지는 리스트 만들어 보기.
        List<String> nameList02 =  Arrays.asList("tom","jerry","ninomous kaiser soje");
        //List<Integer> nameLengthList = nameList02.stream().map(s -> s.length()).collect(Collectors.toList());
        //List<Integer> nameLengthList = nameList02.stream().map(s -> s.length()).collect(Collectors.toList());
        List<Integer> nameLengthList = nameList02.stream().map(String::length).collect(Collectors.toList());
        System.out.println(nameLengthList);

    }
}

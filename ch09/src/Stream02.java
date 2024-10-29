import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream02 {
    public static void main(String[] args) {
        //Collection으로 부터 stream을 만들 수 있다.
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intStream = intList.stream();

        //배열로 부터 stream만들기
        String strArray[] = new String[]{"a", "b", "c"};

        Stream<String> strStream01 = Stream.of("a", "b", "c");
        Stream<String> strStream02 = Stream.of(new String[]{"a", "b", "c"});
        Stream<String> strStream03 = Arrays.stream(new String[]{"a", "b", "c"});
        Stream<String> strStream04 = Arrays.stream(new String[]{"a", "b", "c"}, 0, 2);
        Stream<String> strStream05 = Arrays.stream(strArray);

        //특정 범위의 정수를 요소로 갖는 stream
        IntStream intStream01 = IntStream.range(1, 10);
        intStream01.forEach(System.out::println); //1~9


        //1. Stream은 다양한 데이터를 표준화된 방법으로 다루기 위한 것
        //2. 중간 연산과 최종 연산을 제공한다.
        //3. 이때 만약 최종연산이 끝나면 더 이상 쓸 수 없다. 1회용 이다.
        //4. 데이터 소스로부터 읽기만 한다. 원본 데이터를 바꾸지 않는다.
        List<Integer> integerList = Arrays.asList(3, 1, 4, 5, 2);
        List<Integer> sortedIntegerList = integerList.stream().sorted().collect(Collectors.toList());
        integerList.forEach(System.out::print);
        sortedIntegerList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer);
            }
        });


        //intStream01.forEach(System.out::println);  //람다의 일종  메서드 참조


    }
}

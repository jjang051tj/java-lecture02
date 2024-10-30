import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamReview02 {
    public static void main(String[] args) {
        //최종연산
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        //sum() 결과를 전부 더한값을 던져준다.
        //mapToInt는Stream을 IntStream으로 바꿔준다.  숫자연산에서만 사용
        //그래야지 최종연산중에 sum을 쓸 수 있다.
        long total = integerList.stream().mapToInt(Integer::intValue).count();
        long sum = integerList.stream().mapToInt(Integer::intValue).sum();
        OptionalInt max = integerList.stream().mapToInt(Integer::intValue).max(); //null
        OptionalInt min = integerList.stream().mapToInt(Integer::intValue).min();
        OptionalDouble avg = integerList.stream().mapToInt(Integer::intValue).average();
        if (max.isPresent()) {
            System.out.println("max===" + max.getAsInt());
        } else {
            System.out.println("최대값이 없습니다.");
        }
        System.out.println(total);
        IntStream intStream = IntStream.rangeClosed(1, 10);
        System.out.println("sum===" + intStream.sum());  //숫자관련 스트림에서만 사용 가능


        //allMatch() 전부 조건에 맞아야 함
        //anyMatch() 하나만 맞으면 됨
        // noneMatch() 하나도 맞지 않아야 함...
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9, 11);
        boolean even = numbers.stream().noneMatch(i -> i % 2 == 0); //일치하는게 하나도 없으면
        System.out.println(even);

        //tom, jerry,mickey  이름들이 전부 3글자가 넘는지.... 다 넘으면 true
        List<String> names = Arrays.asList("tom", "jerry", "mickey");
        boolean isAllThree = names.stream().allMatch(s -> s.length() >= 3);
        System.out.println("isAllThree===" + isAllThree);


        List<Integer> numbers02 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer sum03 = numbers02.stream().reduce(0, (a, b) -> a + b);  //모든 곳에 다 쓸 수 있음
        System.out.println("sum03==="+sum03);

        //reduce  누적기
        //1+2+3+4+5+6+7+8+9+10
        int sum02 = 0;
        for (int i = 1; i <= 10; i++) {
            sum02 = sum02 + i;
        }
        //sum02 = 0 + 1;
        //sum02 = 1 + 2;
        //sum02 = 1 + 2 + 3
        //collect  ===  stream을 collection으로 전환
        //apple 5
        //banana 6
        List<String> words = Arrays.asList("apple","banana","cherry","kiwi");
        List<Integer> number03 =  Arrays.asList(1,2,2,2,3,4,4,5,5,1,1,23,4,5,6,7,8,9,10);
        List<Integer> collectList = number03.stream().filter(i -> i%2==0).collect(Collectors.toList());
        Set<Integer> set = number03.stream().collect(Collectors.toSet());
        Map<String,Integer> collectMap = words.stream().collect(Collectors.toMap(word-> word,String::length));

        System.out.println(collectList);
        System.out.println(set);
        System.out.println(collectMap.get("apple"));
    }
}

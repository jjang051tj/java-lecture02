import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Stream03 {
    private static boolean isPrime(int num) {
        if(num<2) return false;
        for(int i=2;i<num;i++) {
            if(num%i==0) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        //중간연산(Stream) , 최종연산
        IntStream intStream = IntStream.rangeClosed(1,10); //1~10
        intStream.skip(3).limit(5).forEach(System.out::print);

        //걸러내기
        System.out.println();
        IntStream intStream02 =  IntStream.of(1,2,2,3,3,3,4,5,5,6);
        intStream02.distinct().forEach(System.out::print);

        System.out.println();
        IntStream intStream03 = IntStream.rangeClosed(1,100); //1~10
        intStream03.filter(i -> i%2!=0 && i%3!=0).forEach(System.out::print); //홀수중에 3의 배수가 아닌 것만 출력
        // 1~100중에 소수만 찾기..... 1 자기 자신의 숫자로만 나누어 지는 숫자
        IntStream intStream04 = IntStream.rangeClosed(1,100); //1~10
        intStream04.filter(new IntPredicate() {
            @Override
            public boolean test(int i) {
                if(i<=1)  return false;
                for(int j=2;j<i;j++) {
                    if(i%j==0) return false;
                }
                return true;
            }
        }).forEach(System.out::print); //홀수중에 3의 배수가 아닌 것만 출력
        //intStream04.filter(i->Stream03.isPrime(i)).forEach(System.out::print); //홀수중에 3의 배수가 아닌 것만 출력
        //intStream04.filter(Stream03::isPrime).forEach(System.out::print); //홀수중에 3의 배수가 아닌 것만 출력
    }
}

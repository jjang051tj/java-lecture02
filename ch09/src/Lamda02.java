@FunctionalInterface
interface LamdaInterface02 {
    int calculate(int x, int y);
}

public class Lamda02 {
    public static void main(String[] args) {
        LamdaInterface02 plus = new LamdaInterface02() {
            @Override
            public int calculate(int x, int y) {
                return x + y;
            }
        };
        System.out.println(plus.calculate(10, 10));
        LamdaInterface02 plusLamda = (x, y) -> x + y;
        System.out.println(plusLamda.calculate(20, 20));
        LamdaInterface02 multiLamda = (x, y) -> {
            return x * y;
        };

    }
}

package abs;

abstract class Calculator{
    abstract public int add(int a, int b);
    abstract public int subtract(int a, int b);
    abstract public double average(int array[]);
}
public class GoodCalculator extends Calculator {

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int subtract(int a, int b) {
        return a-b;
    }

    @Override
    public double average(int[] array) {
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum/array.length;
    }
    //방송심의위원회
    public static void main(String[] args) {
        GoodCalculator goodCalculator = new GoodCalculator();
        System.out.println(goodCalculator.add(10,20));
        System.out.println(goodCalculator.subtract(300,10));

    }
}

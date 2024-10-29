public class Variable {

    public static void main(String[] args) {
        String myName="장성호";
        final int JUMIN_NUMBER = 123456;
        System.out.println(myName);
        System.out.println(JUMIN_NUMBER);
        int num01 = 10;
        short num02 = 20;
        System.out.println(num01+num02);
        //byte<short<int<long
        //형(形,type)변환
        double pi = 3.14;
        int intPi =  (int) pi;

        int intNum=10;
        System.out.println(intNum);
        double doubleNum = 100;
        doubleNum = intNum;
        System.out.println(doubleNum);
        //형변환할때 작은걸 큰거에 넣는건 큰 문제가 없다
        //큰걸 작은거에 넣을때는 반드시 형(type)을 변경해서 넣어야 한다.
        //64비트
        //32비트

        long longNum = 320l;
        int intNum02 =  (int)longNum;
        System.out.println(intNum02);

    }
}

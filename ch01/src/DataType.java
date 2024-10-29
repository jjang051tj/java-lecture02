public class DataType {
    public static void main(String[] args) {
        byte numByte = 127;
        short numShort =  1200;
        int num02 = 50000;
        long num01 = 50000000090L;

        float num03 = 12.7f;
        double num04 = 12.7;

        char ch01 = 'a';
        boolean isTrue = false;

        String str = "글자를 씁니다."; //String 객체이면서 기본 타입처럼 사용 가능

        System.out.println(str);
        System.out.println(num01);
        System.out.println(num02);
        System.out.println(ch01);
        //long 타입의 숫자에는 뒤에 l 또는 L을 붙여쓴다.
    }
}

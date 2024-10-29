public class Type {
    public static void main(String[] args) {
        //진입점
        //자바는 타입을 가진다.
        // 기본 타입   Object형 타입
        // 기본타입 향태를 하나만 가질 수 있다.
        // int,short,byte,long
        // float, double
        // boolean
        // char
        byte byteNum =  -128; //-128~127               8bit   1byte  숫자  2의 8승
        short shortNum = 300; //-32768 ~ 32767         16bit  2byte  숫자  2의 16승
        int num = 10;         //-2147483648~2147483647 32bit  4byte  숫자  2의 32승
        long longNum = 10L;   //                       64bit  8byte  숫자  2의 64승

        float floatNum =  10.5f;//                     32bit  4byte  숫자  2의 32승
        double num02 = 10.5;    //                     64bit  8byte  숫자  2의 64승

        boolean isTrue = true;  //                     1bit
        char ch = 'a';          //                     16bit  2byte  문자

        String  str01 = "장성호";  //    constant pool
        String  str02 = "장성호";  //

        System.out.println("========");
        System.out.println(str01==str02);

        String str03 = new String("장성호");
        String str04 = new String("장성호");  //객체는 선언하면 heap memory
        System.out.println("========");
        System.out.println(str03==str04);
        System.out.println("========");
        System.out.println(str03.equals(str04));

        num = (int)num02;
        num02 = num;
        System.out.println(num);
        System.out.println(num02);
        System.out.println("hello world");
    }
}

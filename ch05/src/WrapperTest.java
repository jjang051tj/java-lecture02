public class WrapperTest {
    public static void main(String[] args) {
        int i = Integer.parseInt("123"); //기본타입과 Wrapper는 호환가능
        String str01 = Integer.toString(123);
        String str02 = Double.toString(12.3);
        String str03 =  Integer.toHexString(255); // 16진수

        System.out.println(str03);
        char c01 = '1';
        char c02 = 'a';
        System.out.println(Character.isDigit(c01));
        System.out.println(Character.isDigit(c02));
        System.out.println(Character.isAlphabetic(c01));
        System.out.println(Character.isAlphabetic(c02));

        System.out.println(Integer.parseInt("-100"));
        System.out.println(Integer.toHexString(255));
        System.out.println(Integer.toBinaryString(16));

        // boxing unboxing
    }
}

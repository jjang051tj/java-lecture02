public class Operator {
    public static void main(String[] args) {
        String first = "장";
        String last = "성호";
        System.out.println(first+last);
        int num01 = 10;
        int num02 = 5;
        System.out.println(num01+num02);
        System.out.println(num01-num02);
        System.out.println(num01*num02);
        System.out.println(num01/num02);
        System.out.println(num01%num02);
        //System.out.println(num01/0);

        System.out.println(num01>=num02); //비교연산자
        System.out.println(num01<=num02); //비교연산자
        System.out.println(num01==num02); //비교연산자
        System.out.println(num01!=num02); //비교연산자
        System.out.println(!true);        //!놓고 ㄱ자 모른다
        System.out.println(!false);

        //논리 연산자  &&(그리고) ||(또는) !(부정)
        // 거짓이 먼저 나오면 좋다 && 참
        // 참이 먼저 나오면 좋다 || 거짓
        System.out.println(true||false);
        System.out.println(true&&false);
        System.out.println(!true);
        System.out.println(!false);



    }
}

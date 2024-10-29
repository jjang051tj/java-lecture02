public class Operator {
    public static void main(String[] args) {
        int num01 = 39;
        int num02 = 10;
        System.out.println(num01+num02);
        System.out.println(num01-num02);
        System.out.println(num01*num02);
        System.out.println(num01/num02);
        System.out.println(num01%num02);
        System.out.println("===============");
        num01 += 10;
        System.out.println(num01);
        num01++;
        System.out.println(num01);
        int num03 = 100;
        int num04 = 50;
        System.out.println(num03>=num04);
        System.out.println(num03<=num04);
        System.out.println(num03==num04);
        System.out.println(num03!=num04);

        boolean bool01 = true;
        boolean bool02 = false;
        System.out.println(bool02 && bool01);
        System.out.println(bool01 || bool02);
        System.out.println(!bool01);
        String result = num03 > num04 ? "크다" : "작다";
//        if(num03>num04) {
//            result=1000;
//        } else {
//            result=500;
//        }
    }
}

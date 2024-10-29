public class ArrayTest {
    public static void main(String[] args) {
        int intArray[];
        int[] intArray02 = new int[5]; //자바 배열은 길이가 정해져 있다.
        String fruits[] = {"바나나","키위","망고","포도"};
        intArray = new int[3]; //길이를 먼저 설정한다.
        intArray[0] = 100;
        intArray[1] = 200;
        intArray[2] = 300;
        for(int i=0;i<intArray.length;i++) {
            System.out.println(intArray[i]);
        }
        //향상된 for문
        for(int num:intArray) {
            System.out.println(num);
        }
        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);
    }
}

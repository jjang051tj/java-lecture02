package problem;

import java.util.Arrays;
import java.util.Scanner;

public class Problem0802 {
    public static boolean isDuplicate(int num,int arr[]) {
        //주어진 숫자가 배열에 있는지 판단하는 함수
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==num) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int testArr[] =  {1,2,3,4,5,6,7};
        System.out.println(isDuplicate(100,testArr));
        System.out.println("몇개의 정수를 만들어 드릴까요");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int nums[] = new int[num];
        boolean isDuplicate = false;
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            int random = (int) (Math.random() * 20);
            if(isDuplicate(random,nums)) {
                i--;
                continue;
            }
            count++;
            nums[i] = random;
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("count==="+count);
    }
}

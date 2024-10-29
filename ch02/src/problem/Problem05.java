package problem;

import java.util.Arrays;
import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("양의 정수 10개를 쓰시오");
        int nums[] = new int[10];
        for(int i=0;i<10;i++) {
            int num = scanner.nextInt();
            nums[i]=num;
        }
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length;i++) {
            if(nums[i]%3==0) {
                System.out.print(nums[i]+"\t");
            }
        }
    }
}

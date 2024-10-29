package problem;

import java.util.Arrays;
import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        System.out.println("몇개의 정수를 만들어 드릴까요");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int nums[] = new int[num];
        boolean isDuplicate = false;
        for (int i = 0; i < nums.length; i++) {
            int random = (int) (Math.random() * 20);
            System.out.printf("i===%d random===%d",i,random);
            for (int j = 0; j <= i; j++) {
                if (random == nums[j]) {
                    isDuplicate = true;
                    break;
                } else {
                    isDuplicate = false;
                }
            }
            if (isDuplicate) {
                i--;
                System.out.printf(" / i===%d",i);
                continue;
            }
            nums[i] = random;
            System.out.println("");
        }
        System.out.println(Arrays.toString(nums));
    }
}

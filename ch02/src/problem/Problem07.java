package problem;

import java.util.Arrays;

public class Problem07 {
    public static void main(String[] args) {
        //10개 저장  배열에 넣을 예정
        int nums[] =  new int[10];
        for(int i=0;i<nums.length;i++) {
            nums[i] = (int)(Math.random()*10);
        }
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
            sum+=nums[i];
            //System.out.print(nums[i]+"\t");
        }
        System.out.println(Arrays.toString(nums));
        System.out.printf("총합은 %d이고 평균은 %.2f이다",sum,(double)sum/nums.length);
    }
}

package problem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();


        // 10, 30 ,40
        int sum = 0;
        int rainNum=0;
        //iterable
        while(true) {
            int num = scanner.nextInt();
            if(num==0) break;
            arrayList.add(num);
            Iterator<Integer> iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                rainNum  = iterator.next();
                System.out.print(rainNum+" ");
            }
            sum+=rainNum;
            System.out.println("평균 강수량은 " + sum/arrayList.size());
        }
    }
}

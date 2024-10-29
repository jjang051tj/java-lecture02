package problem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        //Wrapper int ===> Integer
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int num = scanner.nextInt();
            if(num==-1) break;
            arrayList.add(num);
        }
        //30,50,70,20,35   iterable
        int big = arrayList.get(0);
//        for(int i=1;i<arrayList.size();i++) {
//            if(arrayList.get(i)>big) {
//                big = arrayList.get(i);
//            }
//        }
        Iterator<Integer> iterator = arrayList.iterator();
        //Stream
        while (iterator.hasNext()) {
            //System.out.print(iterator.next()+"/");
            if(iterator.next()>big) {
                big=iterator.next();
            }
        }
        System.out.println("제일 큰 숫자는 "+big);
    }
}

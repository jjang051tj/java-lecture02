package problem;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            String str = scanner.next();
            char ch = str.charAt(0); //char ===> Character
            arrayList.add(ch);
        }
//        System.out.println(arrayList.get(0));
//        System.out.println(arrayList.get(1));
//        System.out.println(arrayList.get(2));
//        System.out.println(arrayList.get(3));
//        System.out.println(arrayList.get(4));
//        System.out.println(arrayList.get(5));
        double sum = 0;
        /*
        for (int i = 0; i < arrayList.size(); i++) {
            char ch = arrayList.get(i);
            if (ch == 'A') sum += 4;
            else if (ch == 'B') sum += 3;
            else if (ch == 'C') sum += 2;
            else if (ch == 'D') sum += 1;
            else sum += 0;
        }
        */
        /*
        for (int i = 0; i < arrayList.size(); i++) {
            char ch = arrayList.get(i);
            switch(ch) {
                case 'A' : sum+=4; break;
                case 'B' : sum+=3; break;
                case 'C' : sum+=2; break;
                case 'D' : sum+=1; break;
                default  : sum+=0; break;
            }
        }
         */
        for (int i = 0; i < arrayList.size(); i++) {
            char ch = arrayList.get(i);
            double score=switch(ch) {
                case 'A' -> 4;
                case 'B' -> 3;
                case 'C' -> 2;
                case 'D' -> 1;
                default  -> 0;
            };
            sum+=score;
        }
        System.out.println("당신의 평균은 "+(sum/arrayList.size()));
    }
}

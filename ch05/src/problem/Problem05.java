package problem;

import java.util.Calendar;

public class Problem05 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
//        if(hour>3 && hour<12) {
//            System.out.println("GOOD MORNING");
//        } else if(hour>=12 && hour<18) {
//            System.out.println("GOOD AFTERNOON");
//        } else if(hour>=18 && hour<20) {
//            System.out.println("GOOD EVENING");
//        } else {
//            System.out.println("GOOD NIGHT");
//        }
        String greeting = "";
//        switch (hour) {
//            case 3 :
//            case 4 :
//            case 5 :
//            case 6 :
//            case 7 :
//            case 8 :
//            case 9 :
//            case 10 :
//            case 11 :
//                greeting="GOOD MORNING";
//                break;
//            case 12 :
//            case 13 :
//            case 14 :
//            case 15 :
//            case 16 :
//            case 17 :
//                greeting="GOOD AFTERNOON";
//                break;
//
//            case 18 :
//            case 19 :
//                greeting="GOOD EVENING";
//                break;
//            default:
//                greeting="GOOD NIGHT";
//        }
//        switch (hour) {
//            case 3,4,5,6,7,8,9,10,11 :
//             greeting="GOOD MORNING";
//             break;
//            case 12,13,14,15,16,17 :
//                greeting="GOOD AFTERNOON";
//                break;
//            case 18,19 :
//                greeting="GOOD EVENING";
//                break;
//            default:
//                greeting="GOOD NIGHT";
//        }
        //향상된 switch
        String greeting02 = switch (hour) {
            case 3, 4, 5, 6, 7, 8, 9, 10, 11 -> {
                System.out.println("GOOD MORNING");
                yield "GOOD MORNING";
            }
            case 12, 13, 14, 15, 16, 17 -> {
                yield "GOOD AFTERNOON";
            }
            case 18, 19 -> "GOOD EVENING";
            default -> "GOOD NIGHT";
        };
        System.out.println(greeting02);
    }
}

import java.util.Calendar;

public class CalendarTest02 {
    public static void main(String[] args) {
        String days[] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        String monthList[] = {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
        Calendar today = Calendar.getInstance();
        Calendar xmas = Calendar.getInstance();
        Calendar current = Calendar.getInstance();
        today.set(2024,10,1);
        xmas.set(2024,11,25);
        int year = today.get(Calendar.YEAR);
        int month = today.get(Calendar.MONTH);
        int dayOfMonth = today.get(Calendar.DAY_OF_MONTH); //이 달의 몇 번째 날
        int date = today.get(Calendar.DATE); //이 달의 몇 번째 날
        int day = today.get(Calendar.DAY_OF_WEEK); //1(일요일),2(월요일),3(화요일)
        int dayOfYear = today.get(Calendar.DAY_OF_YEAR); //1(일요일),2(월요일),3(화요일)
        int weekOfYear = today.get(Calendar.WEEK_OF_YEAR); // 그 해의 몇주차
        int weekOfMonth = today.get(Calendar.WEEK_OF_MONTH); //그 달의 몇주차
        int apm = today.get(Calendar.AM_PM); //오전 오후
        int hour = today.get(Calendar.HOUR); //오전 오후
        int hourOfDay = today.get(Calendar.HOUR_OF_DAY); //오전 오후
        int minute = today.get(Calendar.MINUTE); //오전 오후
        int second = today.get(Calendar.SECOND); //오전 오후
        int lastDate = today.getActualMaximum(Calendar.DATE);


        System.out.println(year+"/"+(month+1)+"/"+dayOfMonth+"/"+day);
        System.out.println(year+"/"+(month+1)+"/"+date+"/"+day);
        System.out.println(year+"/"+monthList[month]+"/"+dayOfMonth+"/"+days[day-1]);
        System.out.println(year+"년 "+weekOfYear+"주차");
        System.out.println((month+1)+"월 "+weekOfMonth+"주차");
        System.out.println(year+"년 "+dayOfYear+"일");
        System.out.println("APM "+apm); //오전 0 , 오후 1
        System.out.println(apm==0?"오전":"오후"); //오전 0 , 오후 1
        System.out.println(hour); //12시 기준 (0~11)
        System.out.println(hourOfDay); //24시 기준(0~23)
        System.out.println(minute); //24시 기준(0~23)
        System.out.println(second); //24시 기준(0~23)
        String strApm =  apm==0?"오전 ":"오후 ";
        System.out.println(strApm+hour+":"+minute+":"+second);
        System.out.println((month+1)+"월의 마지막 날은 "+lastDate);
        long diff = xmas.getTimeInMillis()-current.getTimeInMillis();
        System.out.println("diff==="+(diff/1000));
        long diffSecond =  diff/1000;
        long diffMinutes = diffSecond/60;
        long diffHour = diffMinutes/60;
        long diffDate = diffHour/24;
        System.out.println(diffDate+"일"+(diffHour%24)+"시간"+(diffMinutes)+"분 남았습니다.");
    }
}

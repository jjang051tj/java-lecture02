import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest03 {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        today.add(Calendar.DATE,10);
        int month = today.get(Calendar.MONTH)+1;
        System.out.println(month+"월"+today.get(Calendar.DATE));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String str01 = simpleDateFormat.format(today.getTime());
        System.out.println(str01);
    }
}

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        //Calendar calendar = Calendar.getInstance();
//        LocalDate now = LocalDate.now();
//        LocalTime nowTime = LocalTime.now();
//        LocalDateTime nowDateTime = LocalDateTime.now();
        LocalDate now = LocalDate.of(2024,10,1);
        LocalTime nowTime = LocalTime.of(14,12,12);
        LocalDateTime nowDateTime = LocalDateTime.of(2024,10,1,18,0,0);
        System.out.println(now);
        System.out.println(nowTime);
        System.out.println(nowDateTime);

        System.out.println(now.getYear());
        System.out.println(now.getMonth());  // 달을 문자로(enum) 출력 영어로 나옴
        System.out.println(now.getMonthValue()); // 달을 숫자로 출력
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getDayOfWeek()); //요일 반환
        System.out.println(now.getDayOfWeek().getValue()); //요일 반환

        //LocalDate xmas =  LocalDate.of(2024,12,25);
        LocalDate xmas =  LocalDate.parse("2024-12-25"); //연월일 지정은 연도:월:날짜
        LocalTime backHome =  LocalTime.parse("18:00:00"); // 시:분:초

        System.out.println(xmas.getMonthValue());
        System.out.println(backHome.getHour());

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate formatXmas =  LocalDate.parse("2024/12/25",dateTimeFormatter);
        System.out.println(formatXmas.getMonthValue());
        DateTimeFormatter dateTimeFormatter02 = DateTimeFormatter.ofPattern("HH,mm,ss");
        LocalTime formatBackHome =  LocalTime.parse("18,00,00",dateTimeFormatter02);
        System.out.println(formatBackHome.getHour());
        System.out.println(formatXmas.isLeapYear()?"2024는 윤년":"윤년 아님");



    }
}

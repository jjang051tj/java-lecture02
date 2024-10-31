package utils;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

// 시간 생성 , 이름
public abstract class MyLogger {
    private static final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
    public static void log(Object obj) {
        String time = LocalTime.now().format(formatter);  //11:35:12.992
        System.out.printf("%s [%9s] %s\n",time,Thread.currentThread().getName(),obj);
    }
}

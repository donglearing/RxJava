package io.reactivex.completable;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by pengfei.dong
 * Date 2018/10/23
 * Time 7:37 PM
 */

public class TestLock {
    public static void main(String[] args) {
//        Date dNow = new Date( );
//        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
//        System.out.println("当前时间为: " + ft.format(dNow));
//
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd HH:mm:ss");
//        String dateStr = LocalDate.now().format(dtf);
//        System.out.println(dateStr);
        Runnable run = () -> System.out.println("1111");

        new Thread(run).start();

        String value = "11";
        System.out.println(System.currentTimeMillis());

        StringBuffer stringBuffer  =  new StringBuffer("1111222");

        Function<String, StringBuffer> sup = stringBuffer::append;
        sup.apply("111");
        Map<String, String> map    = new HashMap<>();

        Set<String> seenEvents = new HashSet<>();

//        Set<String> sex3 = seenEvents::add;

        System.out.println(5.00-4.90);

        System.out.println(300-210);

        Date day=new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyMMddHHmmSSS");
        System.out.println(df.format(day));

        Date da = new Date();
        System.out.println(da.getTime());

        LocalTime t = LocalTime.now();
        LocalDateTime t1 = LocalDateTime.now();
        LocalDate t2 = LocalDate.now();
        System.out.println(t1.getLong(ChronoField.MINUTE_OF_DAY));
//        System.out.println(t2.getLong(ChronoField.OFFSET_SECONDS));



        Object inner ;

        inner = value.contains(".") ? new Double(value) : new Integer(value);



    }
}

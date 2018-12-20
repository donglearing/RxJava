package io.reactivex.learrx2;

import io.reactivex.Observable;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * Created by pengfei.dong
 * Date 2018/12/12
 * Time 8:15 PM
 */

public class Testlamda {
    public static void main(String[] args) {


        Map<Long, Long> map = new HashMap<>();

        Set<Long> longs ;
        Observable.range(1,100).subscribe(p -> map.put(new Long(p), new Long(p)));

        longs = map.keySet();

        System.out.println(longs.contains(new Long(1)));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");

        NumberFormat nf = new DecimalFormat("0000");
        System.out.println(nf.format(1222222.2));
        String dateStr = LocalDate.now().plusDays(-1l).format(dtf);

        System.out.println(dateStr);






    }
}

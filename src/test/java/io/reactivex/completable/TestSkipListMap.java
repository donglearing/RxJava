package io.reactivex.completable;

import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * Created by pengfei.dong
 * Date 2018/10/11
 * Time 上午11:17
 */

public class TestSkipListMap {
    public static void main(String[] args) {
        Map<Long ,Map<String,String>> concurrentSkipListMap = new ConcurrentSkipListMap();
        concurrentSkipListMap.computeIfAbsent(10L, t -> new ConcurrentSkipListMap<String,String>());
        concurrentSkipListMap.computeIfAbsent(20L, t -> new ConcurrentSkipListMap<String,String>());
        concurrentSkipListMap.computeIfAbsent(30L, t -> new ConcurrentSkipListMap<String,String>());
        concurrentSkipListMap.computeIfAbsent(40L, t -> new ConcurrentSkipListMap<String,String>());
        concurrentSkipListMap.computeIfAbsent(50L, t -> new ConcurrentSkipListMap<String,String>());
        concurrentSkipListMap.computeIfAbsent(9L, t -> new ConcurrentSkipListMap<String,String>());
//        concurrentSkipListMap.putIfAbsent("1","3");
//        concurrentSkipListMap.putIfAbsent("1","4");

        concurrentSkipListMap.remove(10L);
//        concurrentSkipListMap.computeIfAbsent(10L, t -> new ConcurrentSkipListMap<String,String>());

        concurrentSkipListMap.forEach((k,v) -> System.out.println(k + "    " + v));


        System.out.println(((ConcurrentSkipListMap<Long, Map<String,String>>) concurrentSkipListMap).firstEntry().getKey());
    }
}

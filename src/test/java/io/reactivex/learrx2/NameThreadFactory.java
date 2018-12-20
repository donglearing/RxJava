package io.reactivex.learrx2;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by pengfei.dong
 * Date 2018/12/7
 * Time 5:54 PM
 */

public class NameThreadFactory implements ThreadFactory {

    private AtomicInteger nameIncreased = new AtomicInteger(1);


    private String threadName;

    public NameThreadFactory(String threadName){
        threadName = threadName;

    }

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setName("threda" + threadName + "-" + nameIncreased.getAndIncrement());
        return thread;
    }
}

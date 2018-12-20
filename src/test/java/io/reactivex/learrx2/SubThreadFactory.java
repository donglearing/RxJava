package io.reactivex.learrx2;

import com.google.common.eventbus.Subscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

import java.util.concurrent.*;

/**
 * Created by pengfei.dong
 * Date 2018/12/7
 * Time 5:43 PM
 */

public class SubThreadFactory<T> implements Observer<T>  {

    ThreadPoolExecutor executor = new ThreadPoolExecutor(3, 6, 10,
            TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), new NameThreadFactory("test"));

    public void execute(Runnable command) {
        executor.execute(command);
    }


    @Override
    public void onSubscribe(Disposable d) {

    }


    @Override
    public void onNext(T t) {
        System.out.println(t);
        this.executor.execute(() -> {System.out.println("11");
            System.out.println(Thread.currentThread().getName());
        });
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onComplete() {

        executor.shutdown();
        System.out.println("关闭线程");

    }
}

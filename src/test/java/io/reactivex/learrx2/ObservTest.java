package io.reactivex.learrx2;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by pengfei.dong
 * Date 2018/12/7
 * Time 5:28 PM
 */

public class ObservTest {
    public static void main(String[] args) {
        Observable.create(new ObservableOnSubscribe<Object>() {
            @Override
            public void subscribe(ObservableEmitter<Object> e) throws Exception {
                e.onNext(1);
                e.onNext(1);
                e.onNext(1);
                e.onNext(1);
                e.onNext(1);
                e.onNext(1);
                e.onNext(1);
                e.onNext(1);
                e.onNext(1);
                e.onNext(1);
                e.onNext(1);
                e.onComplete();
                System.out.println("结束推送");

            }
        }).subscribeOn(Schedulers.computation()).subscribe(new SubThreadFactory());

//        Observable.range(1, 100).subscribe(new SubThreadFactory());
    }
}

package com.git.onedayrex.designpattern.observer.observable;

import com.git.onedayrex.designpattern.observer.observer.JackObserver;
import com.git.onedayrex.designpattern.observer.observer.TomObserver;
import org.junit.Test;

public class MyObservableTest {

    @Test
    public void observable() {
        MyObservable myObservable = new MyObservable();
        myObservable.addObserver(new TomObserver());
        myObservable.addObserver(new JackObserver());
        myObservable.notifyObservers("通知更新");
    }

}
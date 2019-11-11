package com.git.onedayrex.designpattern.observer.observer;

import java.util.Observable;
import java.util.Observer;

public class JackObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("观察者对象为==>" + o + "接收参数为==>" + arg);
    }
}

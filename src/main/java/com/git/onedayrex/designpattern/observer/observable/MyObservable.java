package com.git.onedayrex.designpattern.observer.observable;


import java.util.Observable;

/**
 * 具体的主题实现，通过继承jdk中Observable来完成主题
 */
public class MyObservable extends Observable {

    @Override
    public void notifyObservers(Object arg) {
        setChanged();
        super.notifyObservers(arg);
    }
}

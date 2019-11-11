package com.git.onedayrex.designpattern.observer.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 具体的观察者，通过实现jdk的Observer来完成
 */
public class TomObserver implements Observer {

    /**
     * 当对主题感兴趣的内容改变后进行变更通过的方法
     * @param o
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg){
        System.out.println("观察者对象为==>" + o + "接收参数为==>" + arg);
    }
}

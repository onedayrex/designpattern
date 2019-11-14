package com.git.onedayrex.designpattern.proxy.dynamic.jdkproxy;

/**
 * 静态代理主要功能类
 */
public class AnimalJdkImpl implements AnimalJdkSubject {
    @Override
    public void function() {
        System.out.println("jdk spark");
    }
}

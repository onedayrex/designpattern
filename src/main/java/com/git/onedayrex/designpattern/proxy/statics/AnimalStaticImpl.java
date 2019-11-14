package com.git.onedayrex.designpattern.proxy.statics;

/**
 * 静态代理主要功能类
 */
public class AnimalStaticImpl implements AnimalStaticSubject{
    @Override
    public void function() {
        System.out.println("spark");
    }
}

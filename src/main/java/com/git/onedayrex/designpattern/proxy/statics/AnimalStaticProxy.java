package com.git.onedayrex.designpattern.proxy.statics;

/**
 * 静态代理代理类，使用聚合方式，在当前类中实例化一个主题类，
 * 该模式类似于装饰者模式
 */
public class AnimalStaticProxy implements AnimalStaticSubject{

    private AnimalStaticSubject animalStaticSubject;

    public AnimalStaticProxy(AnimalStaticSubject animalStaticSubject) {
        this.animalStaticSubject = animalStaticSubject;
    }

    @Override
    public void function() {
        System.out.println("==>static proxy before method");
        this.animalStaticSubject.function();
        System.out.println("==>static proxy after method");
    }
}

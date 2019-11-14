package com.git.onedayrex.designpattern.proxy.dynamic.cglibproxy;

public class AnimalCglibImpl extends AnimalCglibSubject{
    @Override
    public void function() {
        System.out.println("cglib spark");
    }
}

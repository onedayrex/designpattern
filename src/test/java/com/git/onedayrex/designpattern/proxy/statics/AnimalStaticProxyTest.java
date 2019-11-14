package com.git.onedayrex.designpattern.proxy.statics;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalStaticProxyTest {

    @Test
    public void function() {
        AnimalStaticSubject animalStaticSubject = new AnimalStaticImpl();
        AnimalStaticProxy animalStaticProxy = new AnimalStaticProxy(animalStaticSubject);
        animalStaticProxy.function();
    }
}
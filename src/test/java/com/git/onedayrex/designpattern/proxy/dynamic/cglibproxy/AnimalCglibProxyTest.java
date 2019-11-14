package com.git.onedayrex.designpattern.proxy.dynamic.cglibproxy;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalCglibProxyTest {

    @Test
    public void intercept() {
        AnimalCglibProxy animalCglibProxy = new AnimalCglibProxy();
        AnimalCglibSubject animalCglibSubject = (AnimalCglibSubject) animalCglibProxy.getProxy(AnimalCglibImpl.class);
        animalCglibSubject.function();
    }
}
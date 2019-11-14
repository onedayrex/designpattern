package com.git.onedayrex.designpattern.proxy.dynamic.jdkproxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

import static org.junit.Assert.*;

public class AnimalJdkHandleTest {

    @Test
    public void invoke() {
        AnimalJdkSubject animalJdkSubject = new AnimalJdkHandle(new AnimalJdkImpl()).getProxy();
        animalJdkSubject.function();
    }
}
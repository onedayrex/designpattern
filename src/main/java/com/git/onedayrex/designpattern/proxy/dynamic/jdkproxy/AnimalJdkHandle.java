package com.git.onedayrex.designpattern.proxy.dynamic.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AnimalJdkHandle implements InvocationHandler {
    private Object target;

    public AnimalJdkHandle(Object target) {
        this.target = target;
    }

    /**
     * 获取生成的代理对象
     * @param <T>
     * @return
     */
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(this.target.getClass().getClassLoader(), this.target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("==>jdk proxy before method");
        Object invoke = method.invoke(this.target, args);
        System.out.println("==>jdk proxy after method");
        return invoke;
    }
}

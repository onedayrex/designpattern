package com.git.onedayrex.designpattern.proxy.dynamic.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class AnimalCglibProxy implements MethodInterceptor {
    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class<?> clazz) {
        //通过Enhancer生成代理对象
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        //具体的代理实现
        System.out.println("==>cglib proxy before method");
        Object o = proxy.invokeSuper(obj, args);
        System.out.println("==>cglib proxy after method");
        return o;
    }
}

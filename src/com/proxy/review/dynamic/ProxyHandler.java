package com.proxy.review.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public abstract class ProxyHandler implements InvocationHandler {
    private Object tar;

    public Object bind(Object tar){
        this.tar = tar;
        return Proxy.newProxyInstance(tar.getClass().getClassLoader(),
                new Class[]{Subject.class,Subject2.class}/*tar.getClass().getInterfaces()*/,
                this);
    }


    public abstract void before();
    public abstract void after();
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

        Object result = null;
        before();
        result = method.invoke(tar,objects);
        after();
        return result;
    }
}

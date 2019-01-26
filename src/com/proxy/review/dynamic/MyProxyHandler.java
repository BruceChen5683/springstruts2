package com.proxy.review.dynamic;

public class MyProxyHandler extends ProxyHandler{
    @Override
    public void before() {
        System.out.println("before");
    }

    @Override
    public void after() {
        System.out.println("after");
    }
}

package com.proxy.review.staticproxy;

public class RealSubject implements Subject{
    @Override
    public void action() {
        System.out.println("real do sth");
    }
}

package com.proxy.review.dynamic;

public class RealSubject implements Subject,Subject2{
    @Override
    public void action1() {
        System.out.println("real subject action1");
    }

    @Override
    public void action2() {
        System.out.println("real subject action2");
    }
}

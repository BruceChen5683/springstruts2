package com.proxy.review.dynamic;

public class Test {
    public static void main(String[] args) {
        ProxyHandler proxyHandler = new MyProxyHandler();

        Subject subject = (Subject) proxyHandler.bind(new RealSubject());
        subject.action1();

        Subject2 subject2 = (Subject2) proxyHandler.bind(new Subject2() {
            @Override
            public void action2() {
                System.out.println("local");
            }
        });
        subject2.action2();
    }
}

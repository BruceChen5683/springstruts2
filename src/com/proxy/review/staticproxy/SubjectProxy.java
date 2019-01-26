package com.proxy.review.staticproxy;

public class SubjectProxy implements Subject {
    Subject subject = new RealSubject();
    @Override
    public void action() {
        subject.action();
    }
}

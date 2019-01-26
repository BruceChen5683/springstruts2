package com.proxy.review.staticproxy;

public class Test {
    public static void main(String[] args) {
        Subject subject = new SubjectProxy();
        subject.action();
    }
}

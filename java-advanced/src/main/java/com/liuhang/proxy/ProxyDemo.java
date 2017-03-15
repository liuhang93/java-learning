package com.liuhang.proxy;

interface Subject {
    void request();
}

/**
 * Created by liuhang on 2017/2/13.
 * 代理模式Demo.
 */
public class ProxyDemo {
    public static void main(String[] args) {
        RealSubject subject = new RealSubject();
        MyProxy p = new MyProxy(subject);
        p.request();
    }
}

//原对象(委托对象)
class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("request");
    }
}

class MyProxy implements Subject {
    private Subject subject;

    public MyProxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        System.out.println("PreProcess");
        subject.request();
        System.out.println("PostProcess");
    }
}

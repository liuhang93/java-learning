package com.liuhang.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by liuhang on 2017/2/14.
 * Java实现动态代理
 */
public class DynamicProxyDemo {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        MyProxyHandler myProxyHandler = new MyProxyHandler(realSubject);
        Subject proxySubject = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(),
                RealSubject.class.getInterfaces(), myProxyHandler);
        proxySubject.request();
    }
}

class MyProxyHandler implements InvocationHandler {
    private Subject subject;

    public MyProxyHandler(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before");
        method.invoke(subject, args);
        System.out.println("After");
        return null;
    }
}

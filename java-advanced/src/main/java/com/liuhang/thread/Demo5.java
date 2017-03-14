package com.liuhang.thread;

/**
 * Created by liuhang on 2017/3/13.
 * 多线程，守护线程：setDaemon，当其他非守护线程都执行结束后，jvm就退出，守护进程就不必要继续执行了（典型的守护进程是垃圾回收器）
 */
public class Demo5 {
    public static void main(String[] args) {
       Thread thread1= new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("tom");
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName()  + i);
                }
            }
        });
       Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("cat");
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() + i);
                }
            }
        });
        thread1.setDaemon(true);
        thread1.start();
        thread2.start();
        Thread.currentThread().setName("我是Main线程");
        System.out.println(Thread.currentThread().getName());
    }
}

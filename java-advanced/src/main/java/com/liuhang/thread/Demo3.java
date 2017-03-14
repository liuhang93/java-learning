package com.liuhang.thread;

/**
 * Created by liuhang on 2017/3/13.
 * 多线程，匿名内部类实现多线程，获取名字和设置名字，获取当前线程对象（主线程也可获取）
 */
public class Demo3 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("tom");
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()  + i);
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("cat");
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + i);
                }
            }
        }).start();
        new Thread(){
            @Override
            public void run() {
                Thread.currentThread().setName("pig");
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + i);
                }
            }
        }.start();
        Thread.currentThread().setName("我是Main线程");//获取主线程
        System.out.println(Thread.currentThread().getName());
    }
}

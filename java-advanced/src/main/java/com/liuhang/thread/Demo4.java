package com.liuhang.thread;

/**
 * Created by liuhang on 2017/3/13.
 * 多线程，休眠线程，Thread.sleep(毫秒，纳秒);
 */
public class Demo4 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("tom");
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()  + i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("cat");
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + i);
                    try {
                        Thread.sleep(20);//毫秒
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        Thread.currentThread().setName("我是Main线程");
        System.out.println(Thread.currentThread().getName());
    }
}

package com.liuhang.thread;

/**
 * Created by liuhang on 2017/3/13.
 * 继承Thread 实现多线程
 */
public class Demo1 {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.setName("航");
        thread.start();
        for (int i = 0; i < 10; i++) {
           System.out.println("Main 线程：" + i);
        }

    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName() + ":"+i);
        }
    }
}
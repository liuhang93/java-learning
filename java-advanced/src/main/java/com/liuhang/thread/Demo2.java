package com.liuhang.thread;

/**
 * Created by liuhang on 2017/3/13.
 * 实现Runnable接口，实现多线程
 */
public class Demo2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main 线程:" + i);
        }
    }

}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 线程:" + i);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

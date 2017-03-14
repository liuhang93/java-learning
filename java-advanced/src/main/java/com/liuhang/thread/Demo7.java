package com.liuhang.thread;

/**
 * Created by liuhang on 2017/3/13.
 * 多线程，同步方法,同步代码块 synchronized
 */
public class Demo7 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        new Thread() {
            @Override
            public void run() {
                Thread.currentThread().setName("cat");
//                timer.add(Thread.currentThread().getName());
                timer.decrease(Thread.currentThread().getName());
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                Thread.currentThread().setName("pig");
//                timer.add(Thread.currentThread().getName());
                timer.decrease(Thread.currentThread().getName());
            }
        }.start();
    }

}

class Timer {
    private static int id;

    public  /*synchronized*/ void add(String name) {
        for (int i = 0; i < 5; i++) {
            id++;
            System.out.println("加线程：" + name + "；id=" + id);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void decrease(String name) {
//        synchronized (this)
        {
            for (int i = 0; i < 5; i++) {
                id--;
                System.out.println("减线程：" + name + "；id=" + id);
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

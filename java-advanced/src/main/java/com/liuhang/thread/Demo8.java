package com.liuhang.thread;

/**
 * Created by liuhang on 2017/3/13.
 * volatile 关键字
 */
public class Demo8 extends Thread {
    private static volatile boolean flag;

    @Override
    public void run() {
        while (!flag) {
            System.out.println("不能停");
        }
    }

    public static void main(String[] args) {
        Demo8 d1 = new Demo8();
//        Demo8 d2 = new Demo8();
        d1.start();
//        d2.start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        flag = true;
    }
}

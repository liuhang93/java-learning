package com.liuhang.thread;

/**
 * Created by liuhang on 2017/3/13.
 * volatile 关键字
 */
public class Demo8 {
    public static void main(String[] args) {
        Generator runnable = new Generator();
        Thread thread = new Thread(runnable);
        thread.start();
        runnable.stop();

    }

}

class Generator implements Runnable {
    private boolean flag;

    @Override
    public void run() {
        while (!flag) {
            System.out.println("不能停");
        }
    }

    public void stop() {
        flag = true;
        System.out.println("快停！！！！！！");
    }
}

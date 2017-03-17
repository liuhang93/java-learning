package com.liuhang.thread;

import org.junit.Test;

/**
 * Created by liuhang on 2017/3/15.
 * 多个线程需要同时操作一个资源，发生错误时的演示
 */
public class EvenGenerator {
    private int currentValue = 0;
    private boolean canceled = false;

    public int next() {
        ++currentValue; //危险！
        ++currentValue;
        return currentValue;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public void cancel() {
        canceled = true;
    }

    @Test
    public void test() {
        EvenGenerator generator = new EvenGenerator();
        Thread t1 = new Thread(new EvenChecker(generator));
        Thread t2 = new Thread(new EvenChecker(generator));
        t1.start();
        t2.start();
    }

}

class EvenChecker implements Runnable {

    private EvenGenerator evenGenerator;

    public EvenChecker(EvenGenerator evenGenerator) {
        this.evenGenerator = evenGenerator;
    }

    @Override
    public void run() {
        int nextValue;
        while (!evenGenerator.isCanceled()) {
            nextValue = evenGenerator.next();
            if (nextValue % 2 != 0) {
                System.out.println(nextValue + "不是一个偶数!");
                evenGenerator.cancel();
            }
        }
    }
}

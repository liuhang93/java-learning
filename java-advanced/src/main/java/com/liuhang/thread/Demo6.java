package com.liuhang.thread;

/**
 * Created by liuhang on 2017/3/13.
 * 多线程 join();加入线程,等待加入的线程执行完毕后，当前线程再继续执行（插队）
 * join(int),加入，等待加入的线程执行指定的时间，再轮流执行
 */
public class Demo6 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("tom");
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "第:" + i);
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("cat");
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "第：" + i);
                    if (i == 3) {
                        try {
//                            thread1.join();//直接插队加入，一直执行完thread1
                            thread1.join(130);//加入，让thread执行130ms,再回来轮流执行
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        thread1.start();
        thread2.start();
        Thread.currentThread().setName("我是Main线程");
        System.out.println(Thread.currentThread().getName());
    }
}

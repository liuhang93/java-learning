package com.liuhang.thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by liuhang on 2017/3/17.
 * Timer类： 计时器
 */
public class Demo9 {
    public static void main(String[] args) throws InterruptedException {
        Timer t = new Timer();
        t.schedule(new MyTimerTask(),new Date(114,9,15,10,54,20),3000);
        while (true){
            System.out.println(new Date());
            Thread.sleep(1000);
        }
    }
}
class MyTimerTask extends TimerTask{
    @Override
    public void run() {
        System.out.println("定时起床背英语单词");
    }
}
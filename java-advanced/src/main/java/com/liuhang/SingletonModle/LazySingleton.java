package com.liuhang.SingletonModle;

/**
 * Created by liuhang on 2017/3/17.
 * 懒汉式单例模式
 */
public class LazySingleton {
    /**
     * 覆盖原有的默认构造方法，声明为私有的，防止其他类直接使用构造方法创建单例类对象，同时也使子类无法继承
     */
    private LazySingleton() {
    }

    /**
     * 单例类的唯一实例，但是不是加载时初始化
     */
    private static LazySingleton lazySingleton;

    /**
     * 线程互斥的获取实例
     */
    public static synchronized LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}

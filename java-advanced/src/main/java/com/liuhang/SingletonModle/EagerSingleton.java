package com.liuhang.SingletonModle;

/**
 * Created by liuhang on 2017/3/17.
 * 饿汉式单例模式
 */
public class EagerSingleton {
    /**
     * 覆盖默认的构造方法，将默认的构造方法声明为私有的，防止其他类直接创建对象
     */
    private EagerSingleton() {
    }

    /**
     * 直接创建一个本类的对象
     */
    private static final EagerSingleton eagerSingleton = new EagerSingleton();

    /**
     * 提供一个工厂方法来返回本类的唯一对象
     */
    public static EagerSingleton getInstance() {
        return eagerSingleton;
    }
}

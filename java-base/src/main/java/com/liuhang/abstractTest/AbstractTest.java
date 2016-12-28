package com.liuhang.abstractTest;

/**
 * Created by liuhang on 2016/12/9.
 * 抽象类
 */
public class AbstractTest {
    public static void main(String[]args){
        /**
         * Cat类声明为抽象类,则不能对Cat类进行实例化
         * 抽象类不能被实例化
         */
        // Cat cat=new Cat("catName","blue");
        BlueCat blueCat=new BlueCat("blueCat","blue");
        blueCat.enjoy();
    }
}
abstract class Animal{
    public String name;

    public Animal(String name) {
        this.name = name;
    }
    //定义抽象方法,只有定义,不能有函数体
    public abstract void enjoy();
}

/**
 * Cat继承Animal类,则必须实现其中的抽象方法,否则也要声明为一个抽象类
 */
abstract class Cat extends Animal{
    public String color;

    public Cat(String name, String color) {
        super(name); //调用父类的构造方法
        this.color = color;
    }
}

/**
 * 实现了从父类继承的enjoy方法
 */
class BlueCat extends Cat{

    public BlueCat(String name, String color) {
        super(name, color);
    }

    @Override
    public void enjoy() {
        System.out.println("blue cat enjoy");
    }
}

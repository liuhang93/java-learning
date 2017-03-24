package com.liuhang.reflection;

/**
 * Created by liuhang on 2017/3/23.
 */
public class Demo1 {
    public static void main(String[] args) {
        Foo foo1 = new Foo(); //foo1是Foo类的实例对象
        //Foo这个类，也是一个实例对象，它是Class类的实例对象，"类类型"，这个Class类的实例对象中，保存了这个类的各种信息
        //获取Class类实例对象的三种方式
        //知道类名，每个类都有隐含的静态变量class
        Class c1 = Foo.class;
        //知道类的实例对象
        Class c2 = foo1.getClass();
        System.out.println(c1 == c2);//输出 true， 每个类，只可能是Class类的一个实例对象；
        //知道类的全称
        try {
            Class c3 = Class.forName("com.liuhang.reflection.Foo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //可以类的类类型，来创建该类实例对象
        try {
            Foo foo2 = (Foo) c1.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

}

class Foo {
}

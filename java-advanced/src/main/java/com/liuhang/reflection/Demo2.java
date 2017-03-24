package com.liuhang.reflection;

/**
 * Created by liuhang on 2017/3/24.
 */
public class Demo2 {
    public static void main(String[] args) {
        Class c1 = int.class;//int类型的类类型
        Class c2 = String.class;
        Class c3 = void.class;
        Class c4 = Double.class;

        System.out.println(c1.getName());
        System.out.println(c2.getSimpleName());
        System.out.println(c3.getName());
        System.out.println(c4.getName());
        System.out.println(c4.getSimpleName());//不带包名的类名称

    }
}

package com.liuhang.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by liuhang on 2017/3/24.
 */
public class Demo4 {
    public static void main(String[] args) {
        A a = new A();
        Class c = a.getClass();
        try {
            //获取方法
            Method method = c.getMethod("print", int.class, int.class);
            //方法的反射操作
            //a.print(10,10);
            method.invoke(a, 10, 10);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}

class A {
    public void print(int a, int b) {
        System.out.println(a + "-" + b);
    }

    public void print(String a, String b) {
        System.out.println(a.toUpperCase() + "-" + b.toUpperCase());
    }
}

package com.liuhang.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by liuhang on 2017/3/24.
 * 通过反射了解泛型和集合的本质
 */
public class Demo5 {
    public static void main(String[] args) {
        ArrayList list1=new ArrayList();
        ArrayList<String> list2 = new ArrayList<>();
        Class c1 = list1.getClass();
        Class c2=list2.getClass();
        System.out.println(c1==c2);//输出true

        try {
            Method method=c2.getMethod("add", Object.class);
            method.invoke(list2, 100);//绕过编译，在list2中add了一个整数
            System.out.println(list2.size());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }


}

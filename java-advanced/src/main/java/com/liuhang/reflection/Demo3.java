package com.liuhang.reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by liuhang on 2017/3/24.
 * 获取类的方法信息
 */
public class Demo3 {

    /**
     * Print class message.
     * 打印类的成员信息
     *
     * @param object the object该类的对象
     */
    public static void printClassMessage(Object object) {
        //要获取类的信息，首先要获取类的类类型class type
        Class c1 = object.getClass();//传递的是哪个子类的d对象，c1就是该子类的类类型
        //获取类的全称
        System.out.println("类的名称" + c1.getName());

        //一个成员方法，就是一个java.lang.reflect.Method对象,getMethods获取的是所有的public方法，包括继承而来的
        //getDeclaredMethods获取所有该类自己声明的方法，不问访问权限
        System.out.println("输出类的方法信息methods:");
        Method[] methods = c1.getMethods();
        c1.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            //得到方法返回值类型的类类型
            Class returnType = methods[i].getReturnType();
            System.out.print(returnType.getName() + " ");
            //得到方法的名称
            System.out.print(methods[i].getName() + "(");
            //获取参数类型,得到参数列表的类型的类类型
            Class[] paramTypes = methods[i].getParameterTypes();
            for (Class c : paramTypes) {
                System.out.print(c.getName() + ",");
            }
            System.out.println(")");
        }

        //getFields方法，获取所有的public成员变量信息
        System.out.println("输出类的成员变量信息fields:");
        Field[] fields = c1.getFields();
        c1.getDeclaredFields();
        for (Field field : fields) {
            Class fieldType = field.getType();
            //得到成员变量的名称
            String fieldName = field.getName();
            //得到成员变量的类型名称
            String typeName = fieldType.getName();
            System.out.println(typeName + " " + fieldName);
        }

        //getConstructors方法，所有共有
        System.out.println("输出类的构造函数信息constructor:");
        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.print(constructor.getName() + "（");
            Class[] paraTypes = constructor.getParameterTypes();
            for (Class c : paraTypes) {
                System.out.print(c.getSimpleName() + ",");
            }
            System.out.println(")");
        }

    }

    @Test
    public void test() {
//        String s = "hello";
//        printClassMessage(s);
        Integer n1 = 1;
        printClassMessage(n1);
    }

}

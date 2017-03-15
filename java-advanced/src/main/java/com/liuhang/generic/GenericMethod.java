package com.liuhang.generic;

/**
 * Created by liuhang on 2017/3/8.
 * 泛型方法
 */
public class GenericMethod {
    public static void main(String[]args){
        String str=Demo.fun("Tom");
        int i = Demo.fun(1);
        System.out.println(str + i);
    }
}

class Demo{
    public static  <T> T fun(T t){
        return t;
    }
}

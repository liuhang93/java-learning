package com.liuhang.test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by liuhang on 2017/3/15.
 * 各种用法测试
 */
public class Test {
    public static void main(String[] args) {
//        float[][] f = new float[1][1];
//        float d[][] = new float[1][2];
//        int[] a = new int[2];
//        int c[] = new int[3];
//
//        Integer var1 = new Integer(1);
//        Integer var2 = var1;
//        doSomething(var2);
//        System.out.print(var1.intValue());
//        System.out.print(var1 == var2);

        Set<Integer> set = new HashSet<>();
        set.add(null);
        set.add(3);
        for (Integer integer : set) {
            System.out.println(integer+"-");
        }
    }

    public static void doSomething(Integer integer) {
        integer = new Integer(2);
    }
}

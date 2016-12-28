package com.liuhang.integerTest;

/**
 * Created by liuhang on 2016/12/5.
 */
public class IntegerDeom1 {
    public static void main(String[]args){
        System.out.println(Integer.toBinaryString(-60));
        System.out.println(Integer.toOctalString(60)); //八进制
        System.out.println(Integer.toHexString(60)); //十六进制
        System.out.println(Integer.MAX_VALUE);// int类型最大的数 4个字节 2^31-1
        System.out.println(Integer.MIN_VALUE); //int类型最小的数 -2^31
        Integer a=new Integer("23");
        Integer b=new Integer(211);
    }
}

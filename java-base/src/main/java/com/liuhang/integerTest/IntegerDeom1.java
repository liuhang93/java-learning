package com.liuhang.integerTest;

import org.junit.Test;

/**
 * Created by liuhang on 2016/12/5.
 * 本题是一个自动拆装箱的考题(自动拆装箱JDK需在1.5上）
 1、基本型和基本型封装型进行“==”运算符的比较，基本型封装型将会自动拆箱变为基本型后再进行比较，因此Integer(0)会自动拆箱为int类型再进行比较，显然返回true；
 2、两个Integer类型进行“==”比较，如果其值在-128至127，那么返回true，否则返回false, 这跟Integer.valueOf()的缓冲对象有关，这里不进行赘述。
 3、两个基本型的封装型进行equals()比较，首先equals()会比较类型，如果类型相同，则继续比较值，如果值也相同，返回true
 4、基本型封装类型调用equals(),但是参数是基本类型，这时候，先会进行自动装箱，基本型转换为其封装类型，再进行3中的比较。
 */
public class IntegerDeom1 {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(-60));
        System.out.println(Integer.toOctalString(60)); //八进制
        System.out.println(Integer.toHexString(60)); //十六进制
        System.out.println(Integer.MAX_VALUE);// int类型最大的数 4个字节 2^31-1
        System.out.println(Integer.MIN_VALUE); //int类型最小的数 -2^31
        Integer a = new Integer("23");
        Integer b = new Integer(211);
    }

    @Test
    public void test() {
        int a=257;
        Integer b=257;
        Integer c=257;
        Integer b2=57;
        Integer c2=57;
        System.out.println(a==b);
//System.out.println(a.equals(b));  编译出错，基本型不能调用equals()
        System.out.println(b.equals(257.0));
        System.out.println(b==c);
        System.out.println(b2==c2);

        Integer d = new Integer(55);
        Integer f = new Integer(55);
        System.out.println(d==f);
    }
}

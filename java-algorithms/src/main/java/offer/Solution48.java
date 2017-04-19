package offer;

import org.junit.Test;

/**
 * Created by liuhang on 2017/4/10.
 * 剑指offer 不用加减乘除做加法
 * 利用位运算: 按位或, 可得到不进位加法; 按位与, 可得到进位;
 * 归类: 位运算
 */
public class Solution48 {
    public int add(int num1, int num2) {
        while (num2 != 0) {
            int temp = num1 ^ num2;
            int jinwei = (num1 & num2) << 1;
            num1 = temp;
            num2 = jinwei;
        }
        return num1;
    }

    @Test
    public void test() {
        System.out.println(add(1, -10));
    }
}

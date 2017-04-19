package offer;

import org.junit.Test;

/**
 * Created by liuhang on 2017/4/10.
 * 求1+2+3+...+n
 * 要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * 用递归的方法, 利用&&的短路特性, 前面判断为假则后面的不会执行
 */
public class Solution47 {

    public int Sum_Solution(int n) {
        int sum = n;
        boolean flag = (n > 0) && ((sum += Sum_Solution(n - 1)) > 0);
        return sum;
    }

    @Test
    public void test() {
        System.out.println(Sum_Solution(2));
    }
}

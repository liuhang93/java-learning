package offer;

import org.junit.Test;

/**
 * Created by liuhang on 2017/4/11.
 * 整数中1出现的次数
 */
public class Solution31 {
    public int NumberOf1Between1AndN_Solution(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += count(i);
        }
        return sum;
    }

    private int count(int x) {
        int sum = 0;
        while (x > 0) {
            int temp = x % 10;
            if (temp == 1) {
                sum++;
            }
            x = x / 10;
        }
        return sum;
    }

    @Test
    public void test() {
        System.out.println(NumberOf1Between1AndN_Solution(13));
    }
}

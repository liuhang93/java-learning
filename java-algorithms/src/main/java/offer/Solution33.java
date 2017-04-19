package offer;

import org.junit.Test;

/**
 * Created by liuhang on 2017/4/15.
 * 丑数 是否只包含2 3 5
 * 动态规划  空间换时间
 */
public class Solution33 {
    public int GetUglyNumber_Solution1(int index) {
        if (index <= 0) {
            return 0;
        }
        int count = 0;
        int i = 0;
        while (count < index) {
            i++;
            if (isUgly(i)) {
                count++;
            }

        }
        return i;
    }

    public int GetUglyNumber(int index) {
        if (index < 7) {
            return index;
        }
        int[] ugly = new int[index];
        ugly[0] = 1;
        int t2 = 0, t3 = 0, t5 = 0;
        for (int i = 1; i < index; i++) {
            ugly[i] = Math.min(ugly[t2] * 2, Math.min(ugly[t3] * 3, ugly[t5] * 5));
            while (ugly[t2] * 2 <= ugly[i]) {
                t2++;
            }
            while (ugly[t3] * 3 <= ugly[i]) {
                t3++;
            }
            while (ugly[t5] * 5 <= ugly[i]) {
                t5++;
            }

        }
        return ugly[index - 1];

    }

    private boolean isUgly(int num) {
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        return (num == 1) ? true : false;
    }

    @Test
    public void test() {
        System.out.println(GetUglyNumber(1500));
    }
}

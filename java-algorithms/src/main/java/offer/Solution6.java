package offer;

import org.junit.Test;

/**
 * Created by liuhang on 2017/3/16.
 * 剑指offer 第六题 旋转数组的最小数字
 */

public class Solution6 {
    public int minNumberInRotateArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int start = 0, end = array.length - 1;
        while (start + 1 < end) {
            int temp = start + (end - start) / 2;
            if (array[temp] >= array[start]) {
                start = temp;
            } else {
                end = temp;
            }
        }
        return (array[start] > array[end]) ? array[end] : array[start];
    }

    @Test
    public void test() {
        int[] a = {3, 3, 3, 1, 2};
        System.out.println(minNumberInRotateArray(a));
    }
}

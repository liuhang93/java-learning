package offer;

import org.junit.Test;

/**
 * Created by liuhang on 2017/4/12.
 * 连续子数组的最大和
 * 归类: 数组, 需重点看
 */
public class Solution30 {
    public int FindGreatestSumOfSubArray(int[] array) {
        int sum = array[0];
        int curSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (curSum < 0) {
                curSum = array[i];
            } else {
                curSum += array[i];
            }
            sum = curSum > sum ? curSum : sum;
        }
        return sum;
    }

    @Test
    public void test() {
        int[] arr1 = new int[]{6, -3, -2, 7, -15, 1, 2, 2};
        int[] arr2 = new int[]{-2, -8, -1, -5, -9};
        System.out.println(FindGreatestSumOfSubArray(arr2));
    }
}

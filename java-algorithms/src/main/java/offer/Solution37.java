package offer;

import org.junit.Test;

/**
 * Created by liuhang on 2017/4/12.
 * 数字在排序数组中出现的次数
 */
public class Solution37 {
    public int GetNumberOfK(int[] array, int k) {
        int count = 0;
        if (array == null || array.length == 0)
            return count;
        int left = 0, right = array.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (array[mid] >= k) {
                right = mid;
            } else {
                left = mid;
            }
        }
        int start = -1;
        if (array[left] == k) {
            start = left;
        } else if (array[right] == k) {
            start = right;
        } else {
            return count;
        }
        for (int i = start; i < array.length; i++) {
            if (array[i] == k) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    @Test
    public void test() {
        int[] arr = new int[]{1, 2, 3, 4, 4, 6, 7};
        System.out.println(GetNumberOfK(arr, 4));
    }
}

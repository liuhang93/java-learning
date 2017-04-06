package offer;

import org.junit.Test;

/**
 * Created by liuhang on 2017/3/29.
 * 剑指offer： 二叉搜索树的后序遍历序列
 */
public class Solution23 {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) return false;
        return verifySubArray(sequence, 0, sequence.length - 1);
    }

    private boolean verifySubArray(int[] array, int start, int end) {
        if (start >= end) return true;
        int root = array[end];
        int i = start;
        while (array[i] < root) {
            i++;
        }
        for (int j = i; j < end; j++) {
            if (array[j] <= root) {
                return false;
            }
        }
        return verifySubArray(array, start, i - 1) && verifySubArray(array, i, end - 1);
    }

    @Test
    public void test() {
        int[] array = new int[]{2, 4, 3};
        System.out.print(VerifySquenceOfBST(array));
    }
}

package offer;

import java.util.ArrayDeque;

/**
 * Created by liuhang on 2017/3/28.
 * 剑指offer 题21：栈的压入、弹出序列
 */
public class Solution21 {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int j = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.addLast(pushA[i]);
            while (!stack.isEmpty() && j < popA.length && stack.peekLast() == popA[j]) {
                stack.pollLast();
                j++;
            }
        }
        return j == popA.length ? true : false;
    }
}

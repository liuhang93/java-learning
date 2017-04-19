package offer;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * Created by liuhang on 2017/4/19.
 * 用一个双端队列，队列第一个位置保存当前窗口的最大值，当窗口滑动一次
 * 1.判断当前最大值是否过期
 * 2.新增加的值从队尾开始比较，把所有比他小的值丢掉
 */


public class Solution64 {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> list = new ArrayList<>();
        if (size == 0) return list;
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < num.length; i++) {
            if (deque.isEmpty()) {
                deque.addLast(i);
            } else if (i - size + 1 > deque.peekFirst()) {//检查队列首个元素是否在窗口内
                deque.pollFirst();
            }
            while (!deque.isEmpty()) {//新增元素,从队列尾部比较,比新增小的,去掉
                if (num[i] >= num[deque.peekLast()]) {
                    deque.pollLast();
                } else {
                    break;
                }
            }
            deque.addLast(i);
            if (i + 1 >= size) {
                list.add(num[deque.peekFirst()]);
            }
        }
        return list;

    }
}

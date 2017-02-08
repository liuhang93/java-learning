package com.liuhang.comparator;

/**
 * Created by liuhang on 2017/2/6.
 * Java比较器
 */


import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {

    public static void main(String[] args) {
        Integer[] nums = {2,1,3,4,5,6};
        Arrays.sort(nums, new MyComparator());
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

}

class MyComparator implements Comparator<Integer> {

    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }

}


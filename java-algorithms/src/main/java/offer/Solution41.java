package offer;

import java.util.ArrayList;

/**
 * Created by liuhang on 2017/4/13.
 * 和为s的连续正数序列
 */
public class Solution41 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if (sum < 3) {
            return list;
        }
        int small = 1, big = 2;
        int curSum = small + big;
        while (small <= sum / 2) {
            if (curSum < sum) {
                big++;
                curSum = curSum + big;
            } else if (curSum > sum) {
                curSum = curSum - small;
                small++;
            } else {
                ArrayList<Integer> temp = new ArrayList<>();
                for (int i = small; i <= big; i++) {
                    temp.add(i);
                }
                list.add(temp);
                big++;
                curSum = curSum + big;
            }
        }
        return list;
    }
}

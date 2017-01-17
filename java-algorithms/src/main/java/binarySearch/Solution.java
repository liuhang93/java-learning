package binarySearch;

/**
 * Created by liuhang on 2017/1/6.
 */
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        if (nums.length == 0) return result;
        int start = 0;
        int end = nums.length - 1;
        while (start + 1 < end) {
            int temp = start + (end - start) / 2;
            if (nums[temp] < target) {
                start = temp;
            } else {
                end = temp;
            }
        }
        if (nums[start] == target) {
            result[0] = start;
        } else if (nums[end] == target) {
            result[0] = end;
        } else {
            return result;
        }
        end = nums.length - 1;
        while (start + 1 < end) {
            int temp = start + (end - start) / 2;
            if (nums[temp] > target) {
                end = temp;
            } else {
                start = temp;
            }
        }
        if (nums[end] == target) {
            result[1] = end;
        } else if (nums[start] == target) {
            result[1] = start;
        }
        return result;
    }
}

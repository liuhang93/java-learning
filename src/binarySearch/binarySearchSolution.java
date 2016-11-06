package binarySearch;

/**
 * Created by liuhang on 2016/10/28.
 */
public class binarySearchSolution {
    public int lowerBound(int[] array, int target) {
        /**
         * Find the first position of target
         */
        if (array == null || array.length == 0)
            return -1;
        int start = 0, end = array.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target)
                end = mid;
            if (array[mid] > target)
                end = mid;
            if (array[mid] < target)
                start = mid;
        }
        if (array[start] == target)//返回第一个target值,先看start
            return start;
        if (array[end] == target)
            return end;
        return -1;
    }

    public int upperBound(int[] array, int target) {
        /**
         * Find the last position of target;
         */
        if (array == null || array.length == 0)
            return -1;
        int start = 0, end = array.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target)
                start = mid;//start往前提
            if (array[mid] > target)
                end = mid;
            if (array[mid] < target)
                start = mid;
        }
        if (array[end] == target)//返回最后一个target
            return end;
        if (array[start] == target)
            return start;
        return -1;
    }
}

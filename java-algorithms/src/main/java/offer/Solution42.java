package offer;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by liuhang on 2017/4/14.
 */
public class Solution42 {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean find = false;
        int[] index = new int[2];
        int i = 0, j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] > sum) {
                j--;
            } else if (array[i] + array[j] < sum) {
                i++;
            } else {
                index[0] = array[i];
                index[1] = array[j];
                break;
            }
        }
        if (find) {
            list.add(index[0]);
            list.add(index[1]);
            find = true;
        }
        return list;
    }

    @Test
    public void test() {
        int[] arr = new int[]{1, 2, 4, 7, 11, 15};
        ArrayList<Integer> list = FindNumbersWithSum(arr, 15);
        for (int elem : list) {
            System.out.println(elem + " ");
        }
    }
}

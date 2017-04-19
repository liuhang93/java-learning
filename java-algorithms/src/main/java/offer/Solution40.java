package offer;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liuhang on 2017/4/13.
 * 数组中只出现一次的数字
 */
public class Solution40 {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        if (array == null || array.length <= 1) {
            return;
        }
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i]) == null) {
                map.put(array[i], 1);
                continue;
            }
            if (map.get(array[i]) == 1) {
                map.remove(array[i]);
            }
        }
        int[] temp = new int[2];
        int k = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            temp[k] = entry.getKey();
            k++;
        }
        num1[0] = temp[0];
        num2[0] = temp[1];
    }

    @Test
    public void test() {
        int[] arr = new int[]{1, 2, 1, 2, 3, 4, 4, 5, 7, 5};
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        FindNumsAppearOnce(arr, num1, num2);
        System.out.println(num1[0] + " " + num2[0]);
    }
}

package offer;

import org.junit.Test;

/**
 * Created by liuhang on 2017/3/17.
 */
public class Solution13 {
    public void reOrderArray(int[] array) {
        int i = 0,k=0;
        while (i < array.length -k) {
            if (array[i] % 2 == 0) {
                int temp = array[i];
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = temp;
                k++;
            } else {
                i++;
            }
        }
    }

    @Test
    public void test() {
        int[] array = {1, 2, 3, 4, 5,6};
        reOrderArray(array);
        for (int i : array) {
            System.out.print(i + "-");
        }
    }
}

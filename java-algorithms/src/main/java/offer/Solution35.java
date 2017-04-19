package offer;

import org.junit.Test;

/**
 * Created by liuhang on 2017/4/11.
 * 数组中的逆序对
 * 用归并排序; 归类,排序
 */
public class Solution35 {

    private int count;

    public int InversePairs(int[] array) {
        int[] helper = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            helper[i] = array[i];
        }
        mergeSort(array, helper, 0, array.length - 1);
        return count % 1000000007;
    }

    private void mergeSort(int[] array, int[] helper, int left, int right) {
        if (left == right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(array, helper, left, mid);
        mergeSort(array, helper, mid + 1, right);
        int i = left, j = mid + 1, k = left;
        while (i <= mid && j <= right) {
            if (helper[i] > helper[j]) {
                array[k] = helper[j];
                k++;
                j++;
                count = count + mid - i + 1;
                if (count >= 1000000007) {
                    count %= 1000000007;
                }
            } else {
                array[k] = helper[i];
                k++;
                i++;
            }
        }
        while (i <= mid) {
            array[k] = helper[i];
            i++;
            k++;
        }
        while (j <= left) {
            array[k] = helper[j];
            j++;
            k++;
        }
        for (int s = left; s <= right; s++) {
            helper[s] = array[s];
        }
    }

    @Test
    public void test() {
        int[] arr = new int[]{364, 637, 341, 406, 747, 995, 234, 971, 571, 219, 993, 407, 416,
                366, 315, 301, 601, 650, 418, 355, 460, 505, 360, 965, 516, 648, 727, 667, 465,
                849, 455, 181, 486, 149, 588, 233, 144, 174, 557, 67, 746, 550, 474, 162, 268,
                142, 463, 221, 882, 576, 604, 739, 288, 569, 256, 936, 275, 401, 497, 82, 935,
                983, 583, 523, 697, 478, 147, 795, 380, 973, 958, 115, 773, 870, 259, 655, 446,
                863, 735, 784, 3, 671, 433, 630, 425, 930, 64, 266, 235, 187, 284, 665, 874, 80,
                45, 848, 38, 811, 267, 575};
        int[] arr2 = new int[]{1, 2, 3, 0};
        System.out.println(InversePairs(arr));
    }
}


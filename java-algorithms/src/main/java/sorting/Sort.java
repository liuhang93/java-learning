package sorting;

/**
 * Created by liuhang on 2016/11/6.
 * 各种经典的排序方法
 */
public class Sort {
    public static void main(String[] args) {
        int[] unSortedArray = new int[]{6, 5, 3, 1, 8, 7, 2, 4};
        int[] unSortedArray1 = new int[]{6};
//        bubbleSort(unSortedArray);
//        selectionSort(unSortedArray);
//        quickSort(unSortedArray);
        insertionSort(unSortedArray);
//        mergeSort(unSortedArray);
        for (int i : unSortedArray) {
            System.out.print(i + "-");
        }

    }

    /**
     * 冒泡排序
     * 1. 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
     * 2. 对第0个到第n-1个数据做同样的工作。这时，最大的数就“浮”到了数组最后的位置上。
     * 3. 针对所有的元素重复以上的步骤，除了最后一个。
     * 4. 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
     *
     * @param array 待排序的数组
     */
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    /**
     * 选择排序
     * 1.在未排序序列中找到最小（大）元素，存放到排序序列的起始位置。
     * 2.再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
     * 3.以此类推，直到所有元素均排序完毕。
     *
     * @param array 待排序的序列
     */
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    /**
     * Quick sort.
     * 1.从数列中挑出一个元素作为基准数。(一般把第一个当基准)
     * 2. 分区过程，将比基准数大的放到右边，小于或等于它的数都放到左边。
     * 3. 再对左右区间递归执行第二步，直至各区间只有一个数。
     *
     * @param array 待排序的序列
     */
    public static void quickSort(int[] array) {
        partition(array, 0, array.length - 1);
    }

    private static void partition(int[] array, int l, int u) {
        int m = l;
        if (l >= u) {
            return;
        }
        //比基准小，就放到小序列的最后
        for (int i = l + 1; i <= u; i++) {
            if (array[i] < array[l]) {
                m += 1;
                int temp = array[m];
                array[m] = array[i];
                array[i] = temp;
            }
        }
        int temp = array[m];
        array[m] = array[l];
        array[l] = temp;
        partition(array, l, m - 1);
        partition(array, m + 1, u);
    }

    /**
     * 插入排序.
     * 1.从第一个元素开始，该元素可以认为已经被排序
     * 2.取出下一个元素，在已经排序的元素序列中从后向前扫描
     * 3.如果被扫描的元素（已排序）大于新元素，将该元素后移一位
     * 4.重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
     * 5.将新元素插入到该位置后
     * 6.重复步骤2~5
     *
     * @param array the array
     */
    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int key = array[i + 1];
            int index = i;
            while (index >= 0 && array[index] > key) {
                array[index + 1] = array[index];
                index--;
            }
            array[index + 1] = key;
        }

    }

    /**
     * Merge sort.
     * 归并排序的思想就是先递归分解数组，再合并数组
     *
     * @param array the array
     */
    public static void mergeSort(int[] array) {
        divide(array, 0, array.length - 1);
    }

    /**
     * 递归分解数组 基本思路是将数组分解成left和right
     * ，如果这两个数组内部数据是有序的，那么就可以用上面合并数组的方法将这两个数组合并排序。
     * 如何让这两个数组内部是有序的？可以再二分
     * ，直至分解出的小组只含有一个元素时为止，此时认为该小组内部已有序。然后合并排序相邻二个小组即可。
     */
    private static void divide(int[] array, int low, int up) {
        if (low >= up) return;
        int mid = low + (up - low) / 2;
        divide(array, low, mid);
        divide(array, mid + 1, up);
        merge(array, low, mid, up);
    }

    /**
     * 合并两个已经有序的数组
     * 基本思路是比较两个数组的最前面的数，谁小就先取谁，取了后相应的指针就往后移一位。
     * 然后再比较，直至一个数组为空，最后把另一个数组的剩余部分复制过来即可。
     */
    private static void merge(int[] array, int low, int mid, int up) {
        int[] helper = new int[array.length];
        for (int i = low; i <= up; i++) {
            helper[i] = array[i];
        }
        int i = low, j = mid + 1, k = low;
        while (i <= mid && j <= up) {
            if (helper[i] < helper[j]) {
                array[k] = helper[i];
                k++;
                i++;
            } else {
                array[k] = helper[j];
                k++;
                j++;
            }
        }
        while (j <= up) {
            array[k] = helper[j];
            j++;
            k++;
        }
        while (i <= mid) {
            array[k] = helper[i];
            i++;
            k++;
        }
    }

}

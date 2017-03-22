package offer;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by liuhang on 2017/3/18.
 */
public class Solution19 {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int len1 = matrix[0].length;
        int len2 = matrix.length;
        int ring = len1 % 2 + len1 / 2;
        for (int i = 1; i <= ring; i++) {

            addRing(i, matrix, list);
        }
        return list;
    }

    private void addRing(int ring, int[][] matrix, ArrayList<Integer> list) {
        int len1 = matrix[0].length;
        int len2 = matrix.length;
        for (int i = ring - 1; i <= len1 - ring; i++) {
            list.add(matrix[ring - 1][i]);
        }
        for (int i = ring; i <= len2 - ring; i++) {
            list.add(matrix[i][len1 - ring]);
        }
        for (int i = len1 - ring - 1; i >= ring - 1; i--) {
            list.add(matrix[len2 - ring][i]);
        }
        for (int i = len2 - ring - 1; i >= ring; i--) {
            list.add(matrix[i][ring - 1]);
        }
    }

    @Test
    public void test() {
        int[][] matrix = new int[4][];
        matrix[0] = new int[]{1, 2, 3, 4};
        matrix[1] = new int[]{5, 6, 7, 8};
        matrix[2] = new int[]{9, 10, 11, 12};
        matrix[3] = new int[]{13, 14, 15, 16};
        ArrayList<Integer> list = printMatrix(matrix);
        for (int i : list) {
            System.out.print(i + "-");
        }
    }
}

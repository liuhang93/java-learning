package offer;

import java.util.ArrayList;

/**
 * Created by liuhang on 2017/3/18.
 */

public class Solution19 {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0;
        while (start * 2 < columns && start * 2 < rows) {
            printCircle(list, matrix, start, rows, columns);
            start += 1;
        }
        return list;
    }

    private void printCircle(ArrayList<Integer> list, int[][] matrix, int start, int rows, int
            columns) {
        int endRow = rows - 1 - start;//终止行号
        int endColumns = columns - 1 - start;//终止列号
        //打印第一行
        for (int i = start; i <= endColumns; i++) {
            list.add(matrix[start][i]);
        }

        //打印上到下的那一列
        if (endRow > start) {
            for (int i = start + 1; i <= endRow; i++) {
                list.add(matrix[i][endColumns]);
            }
        }
        //打印从右往左的那一行
        if (endRow > start && endColumns > start) {
            for (int i = endColumns - 1; i >= start; i--) {
                list.add(matrix[endRow][i]);
            }
        }
        //打印最后一列，由下到上
        if (endRow - 1 > start && endColumns > start) {
            for (int i = endRow - 1; i > start; i--) {
                list.add(matrix[i][start]);
            }
        }

    }
}
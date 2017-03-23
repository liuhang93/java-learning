package interview.netease;

import java.util.Scanner;

/**
 * 网易2017秋招编程题1.
 * https://www.nowcoder.com/test/question/0147cbd790724bc9ae0b779aaf7c5b50?pid=2811407&tid=7344945
 * 如果一个数字序列逆置之后跟原序列是一样的就称这样的数字序列为回文序列。例如：
 * {1, 2, 1}, {15, 78, 78, 15} , {112} 是回文序列,
 * {1, 2, 2}, {15, 78, 87, 51} ,{112, 2, 11} 不是回文序列。
 * 现在给出一个数字序列，允许使用一种转换操作：
 * 选择任意两个相邻的数，然后从序列移除这两个数，并用这两个数字的和插入到这两个数之前的位置(只插入一个和)。
 * 现在对于所给序列要求出最少需要多少次操作可以将其变成回文序列。
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
//        for (int elem : array) {
//            System.out.print(elem + "-");
//        }
        int count = 0;
        int l = 0, u = n - 1;
        while (l < u) {
            if (array[l] == array[u]) {
                l++;
                u--;
            } else if (array[l] < array[u]) {
                array[l + 1] += array[l];
                l++;
                count++;
            } else {
                array[u - 1] += array[u];
                u--;
                count++;
            }
        }
        System.out.println(count);
    }
}
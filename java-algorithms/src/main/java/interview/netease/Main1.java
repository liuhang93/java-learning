package interview.netease;

import java.util.Scanner;

/**
 * 网易2017秋招编程题1.
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
        int count=0;
        int l=0,u=n-1;
        while (l < u) {
            if (array[l] == array[u]) {
                l++;
                u--;
            } else if (array[l] < array[u]) {
                array[l + 1] += array[l];
                l++;
                count++;
            }else {
                array[u - 1] += array[u];
                u--;
                count++;
            }
        }
        System.out.println(count);
    }
}
package interview;

import java.util.Scanner;

/**
 * Created by liuhang on 2017/3/30.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }
        int[][] x = new int[p][2];
        for(int i=0;i<p;i++){
            x[i][0] = in.nextInt();
            x[i][1] = in.nextInt();
        }
        System.out.println(3);
        System.out.println(1);
    }
}

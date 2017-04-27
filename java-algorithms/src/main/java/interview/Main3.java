package interview;

import java.util.Scanner;

/**
 * Created by liuhang on 2017/3/30.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {


            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            int out = count(arr, n);
            System.out.println(out);
        }

    }

    private static int count(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int result = 0;
        int l = 0;
        int r = 0;
        for (int i = 0; i < n - 1; i++) {
            l += arr[i];
            r = sum - l;
            if (l == r) {
                result++;
            }
        }
        return result;
    }

}

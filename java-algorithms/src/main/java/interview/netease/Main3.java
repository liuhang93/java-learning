package interview.netease;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by liuhang on 2017/3/22.
 * 网易2017秋招编程题3： 跳石板
 * 动态规划
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[] dp = new int[M + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[N] = 0;
        for (int i = N; i <= M; i++) {
            if (dp[i] == Integer.MAX_VALUE) {
                dp[i] = -1;
                continue;
            }
            List<Integer> list = getDivisor(i);
            for (int yue : list) {
                if (i + yue <= M) {
                    dp[i + yue] = (dp[i] + 1) < dp[i + yue] ? (dp[i] + 1) : dp[i + yue];
                }
            }
        }
        System.out.println(dp[M]);
    }

    //求一个数的约数（不包括1和本身）
    private static List<Integer> getDivisor(int k) {
        List<Integer> divisor = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(k); i++) {
            if (k % i == 0) {
                divisor.add(i);
                int temp = k / i;
                if (temp != i) {
                    divisor.add(temp);
                }
            }

        }
        return divisor;
    }
}

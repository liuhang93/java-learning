package interview.netease;

import java.util.Scanner;

/**
 * Created by liuhang on 2017/3/22.
 * 网易2017秋招编程题4： 暗黑的字符串
 * https://www.nowcoder.com/question/next?pid=2811407&qid=46576&tid=7348975
 * 参考：http://blog.csdn.net/sgzqc/article/details/52775248
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[][] dp = new long[n + 1][2];//防止溢出！
        if (n == 1) {
            System.out.println(3);
        }
        dp[2][0] = 3;
        dp[2][1] = 6;
        for (int i = 3; i <= n; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 1][1];
            dp[i][1] = dp[i - 1][0] * 2 + dp[i - 1][1];
        }
        System.out.println(dp[n][0] + dp[n][1]);
    }
}

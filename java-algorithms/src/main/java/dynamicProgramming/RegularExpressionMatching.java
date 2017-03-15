package dynamicProgramming;

/**
 * Created by liuhang on 2017/2/14.
 */
public class RegularExpressionMatching {
    public static boolean isMatch(String s, String p) {
        if (s == null || p == null) {
            return false;
        }
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;
        for (int j = 0; j < p.length(); j++) {
            if (j == 0) {
                if (p.charAt(j) == '*') {
                    return false;
                }
            }
            if (p.charAt(j) == '*') {
                if (j == 1) {
                    dp[0][j + 1] = true;
                } else {
                    dp[0][j + 1] = dp[0][j - 1];
                }
            }
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                if (p.charAt(j) == '.') {
                    dp[i + 1][j + 1] = dp[i][j];
                }
                if (p.charAt(j) == s.charAt(i)) {
                    dp[i + 1][j + 1] = dp[i][j];
                }
                if (p.charAt(j) == '*') {
                    if (p.charAt(j - 1) != s.charAt(i) && p.charAt(j - 1) != '.') {
                        dp[i + 1][j + 1] = dp[i + 1][j - 1];
                    } else {
                        dp[i + 1][j + 1] = (dp[i][j + 1] || dp[i + 1][j] || dp[i + 1][j - 1]);
                    }

                }
            }
        }
        return dp[s.length()][p.length()];
    }

    public static void main(String[] args) {
        isMatch("", ".");
    }
}

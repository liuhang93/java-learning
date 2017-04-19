package offer;

import org.junit.Test;

/**
 * Created by liuhang on 2017/4/14.
 */
public class Solution43 {
    public String LeftRotateString(String str, int n) {
        if (str == null || str.length() == 0) return "";
        int len = str.length();
        while (n > len) {
            n = n % len;
        }
        String str1 = str.substring(n, len) + str.substring(0, n);
        return str1;
    }

    @Test
    public void test() {
        String str = "abcXYZdef";
        System.out.println(LeftRotateString(str, 3));
    }
}

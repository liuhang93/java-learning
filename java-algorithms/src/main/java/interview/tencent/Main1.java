package interview.tencent;

import org.junit.Test;

/**
 * Created by liuhang on 2017/4/12.
 * 计算字符逆序数, 值包含ABCD四个字符,要求复杂度(n)
 */
public class Main1 {
    public int count(String string) {
        int numA = 0;
        int numB = 0;
        int numC = 0;
        int numD = 0;
        int sum = 0;
        for (int i = string.length() - 1; i >= 0; i--) {
            char c = string.charAt(i);
            if (c == 'A') {
                numA++;
            }
            if (c == 'B') {
                sum += numA;
                numB++;
            }
            if (c == 'C') {
                sum = sum + numA + numB;
                numC++;
            }
            if (c == 'D') {
                sum = sum + numA + numB + numC;
                numD++;
            }
        }
        return sum;
    }

    @Test
    public void test() {
        String str = "DBBAC";
        System.out.println(count(str));
    }
}

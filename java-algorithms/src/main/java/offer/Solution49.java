package offer;

/**
 * Created by liuhang on 2017/4/10.
 * 字符串转数组
 * 归类: 字符串
 */
public class Solution49 {
    public int str2int(String string) {
        int sum = 0;
        int flag = 1;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c >= 48 && c <= 57) {
                sum = sum * 10 + c - 48;
            } else {
                if (i == 0) {
                    if (c == '+') {
                        flag = 1;
                    }
                    if (c == '-') {
                        flag = -1;
                    }
                } else {
                    sum = 0;
                    break;
                }
            }
        }
        return sum * flag;
    }
}

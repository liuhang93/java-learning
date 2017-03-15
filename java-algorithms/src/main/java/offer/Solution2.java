package offer;

/**
 * Created by liuhang on 2017/3/14.
 * 剑指offer 第二题 替换空格
 */
public class Solution2 {
    public static String replaceSpace(StringBuffer str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                str.replace(i, i + 1, "%20");
            }
        }
        return str.toString();
    }
}

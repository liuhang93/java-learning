package offer;

import org.junit.Test;

/**
 * Created by liuhang on 2017/4/14.
 */
public class Solution44 {
    public String ReverseSentence(String str) {
        if (str.trim().equals("")) {
            return str;
        }
        String[] strings = str.split(" ");
        String reverse = "";
        for (int i = strings.length - 1; i >= 0; i--) {
            reverse = reverse + strings[i] + " ";
        }
        return reverse.substring(0, reverse.length() - 1);
    }

    @Test
    public void test() {
        String str = " ";
        System.out.println(ReverseSentence(str));
    }
}

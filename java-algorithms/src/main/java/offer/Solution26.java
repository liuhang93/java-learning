package offer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by liuhang on 2017/4/2.
 * 字符串的排列,求全排列的方法，用递归
 */
public class Solution26 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        if (str == null || str.length() == 0) return list;
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        permutation(chars, 0, list);
        Collections.sort(list);
        return list;
    }

    private void permutation(char[] chars, int start, List<String> list) {
        if (start == chars.length - 1) {
            list.add(String.valueOf(chars));
        } else {
            for (int i = start; i < chars.length; i++) {
                if (i == start || chars[i] != chars[start]) {
                    char temp = chars[start];
                    chars[start] = chars[i];
                    chars[i] = temp;
                    permutation(chars, start + 1, list);
                    temp = chars[start];
                    chars[start] = chars[i];
                    chars[i] = temp;
                }
            }
        }
    }

    @Test
    public void test() {
        String s = "baa";
        List<String> l = Permutation(s);
        System.out.println("success");
    }
}

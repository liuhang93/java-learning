package interview.alibaba;

import java.util.Scanner;

/**
 * Created by liuhang on 2017/4/26.
 * 阿里巴巴在线编程题环境
 */
public class Main {
    //正则匹配
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//        String pattern = in.nextLine();
        int strIndex = 0, patternIndex = 0;
        String str = "100-trade-done";
        String pattern = "1*tra?e*done";

        System.out.println(match(str, strIndex, pattern, patternIndex));

    }

    private static int match(String str, int strIndex, String pattern, int patternIndex) {
        // p,str都到尾部
        if (strIndex == str.length() && patternIndex == pattern.length()) {
            return 1;
        }
        // p先到尾部
        if (strIndex < str.length() && patternIndex >= pattern.length()) {
            return 0;
        }

        //s先到尾部,p还没到尾部
        if (strIndex == str.length() && patternIndex != pattern.length()) {
            for (int i = patternIndex; i < pattern.length(); i++) {
                if (pattern.charAt(i) != '*' || pattern.charAt(i) != '?') {
                    return 0;
                }
            }
            return 1;
        }
        if (patternIndex < pattern.length()) {
            if (pattern.charAt(patternIndex) != '*') {
                if (str.charAt(strIndex) == pattern.charAt(patternIndex) || pattern.charAt(patternIndex) == '?') {
                    return match(str, strIndex + 1, pattern, patternIndex + 1);
                } else {
                    return 0;
                }
            } else {
                int i;
                for (i = patternIndex + 1; i < pattern.length(); i++) {
                    if (pattern.charAt(i) == '*') {
                        continue;
                    } else {
                        int temp = strIndex;
                        for (int j = strIndex; j < str.length(); j++) {
                            if (str.charAt(j) == pattern.charAt(i)) {
                                temp = j;
                                return match(str, temp + 1, pattern, i + 1);
                            }
                        }
                        return 0;
                    }
                }
                return 1;
            }
        }
        return 0;

    }

}

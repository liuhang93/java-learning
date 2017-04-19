package offer;

import org.junit.Test;

/**
 * Created by liuhang on 2017/4/16.
 * 字符串 正则表达式匹配
 * 1.模式中,当前字符的下一个字符不是'*'
 * 如果当前字符匹配,则字符串和模式串都下移一位
 * 如果当前字符不匹配,则直接返回false
 * 2. 模式中,当前字符的下一个字符是'*'
 * 如果当前字符不匹配,则'*'匹配0个前位字符,模式串后移两位(前位字符,*前面的那个字符)
 * 如果当前字符匹配,分两组
 * '*'匹配0个前位字符,模式串后移两位
 * '*'匹配一个或者多个前位字符,字符串后移以为,模式串不变
 * 注意: 模式串到达最后,字符串还没完,则直接返回false;  注意边界,当模式串没有下一个字符的情况
 */
public class Solution52 {
    public boolean match1(char[] str, char[] pattern) {
        return new String(str).matches(new String(pattern));
    }

    public boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null) {
            return false;
        }
        int strIndex = 0, patternIndex = 0;
        return matchCore(str, strIndex, pattern, patternIndex);

    }

    private boolean matchCore(char[] str, int strIndex, char[] pattern, int patternIndex) {
        //str到尾部,pattern到尾部,匹配成功
        if (strIndex == str.length && patternIndex == pattern.length) {
            return true;
        }

        //pattern到尾,str未到尾部,匹配失败
        if (strIndex != str.length && patternIndex == pattern.length) {
            return false;
        }

        //str到尾部,pattern未到尾部
        if (strIndex == str.length && patternIndex != pattern.length) {
            //剩下的pattern必须为a*b*c*的形式
            if (patternIndex + 1 < pattern.length && pattern[patternIndex + 1] == '*') {
                return matchCore(str, strIndex, pattern, patternIndex + 2);
            }
            return false;
        }

        //str,pattern都未到尾部
        if (patternIndex + 1 < pattern.length) {
            if (pattern[patternIndex + 1] == '*') {//模式当前位置的下一个是*
                //当前位置匹配
                if (pattern[patternIndex] == str[strIndex] || pattern[patternIndex] == '.') {
                    //分两种情况: 匹配0个字符,匹配一个或多个字符
                    return matchCore(str, strIndex, pattern, patternIndex + 2) || matchCore(str,
                            strIndex + 1,
                            pattern,
                            patternIndex);
                } else {//当前位置不匹配
                    return matchCore(str, strIndex, pattern, patternIndex + 2);
                }

            } else {//模式当前位置的下一个不是*，
                //当前位置匹配
                if (pattern[patternIndex] == str[strIndex] || pattern[patternIndex] == '.') {
                    return matchCore(str, strIndex + 1, pattern, patternIndex + 1);
                } else {//当前位置不匹配
                    return false;
                }
            }
            //模式没有下一个字符的情况
        } else if (pattern[patternIndex] == str[strIndex] || pattern[patternIndex] == '.') {
            return matchCore(str, strIndex + 1, pattern, patternIndex + 1);
        }

        return false;

    }

    @Test
    public void test() {
        char[] a = new char[0];
        char[] b = {'.'};
        System.out.print(match(a, b));
    }
}

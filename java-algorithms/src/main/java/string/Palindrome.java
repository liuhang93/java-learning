package string;

/**
 * Created by liuhang on 2016/12/28.
 * 回文字符串问题
 */
public class Palindrome {
    /**
     * 测试: leetcode:8ms
     * 分析: 首尾指针法,忽略大小写,值考虑字母和数字(运用Character API)
     * 字符的判断使用java.lang.Character API
     */
    public boolean isPalindrome(String s) {
        if(s==null||s.isEmpty()) return true;
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if(!Character.isLetterOrDigit(s.charAt(l))){
                l++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(r))){
                r--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(l)) == Character.toLowerCase(s.charAt(r))) {
                l++;
                r--;
            }else {
                return false;
            }
        }
        return true;
    }
}

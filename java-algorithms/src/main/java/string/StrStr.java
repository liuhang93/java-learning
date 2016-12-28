package string;

/**
 * Created by liuhang on 2016/12/27.
 * 字符串查找,返回出现的第一个位置(从0开始,不存在返回-1)
 */
public class StrStr {
    /**
     * 方法1,直接用java indexOf函数
     * 测试: LeetCode: 6ms;
     */
    public static int indexOf(String source, String target) {
        return source.indexOf(target);
    }

    /**
     * 方法2,暴力匹配, 时间复杂度最坏情况下为O(m*(m-n+1))
     * 测试: LeetCode: 10ms
     * 分析:
     * 1. 双重循环, 外层注意i<source.length()-target.length()+1,否则可能溢出
     * 2. 内层注意j不在for中声明, 返回时判断条件为j==length()
     */
    public static int forceSearch(String source, String target) {
        for (int i = 0; i < source.length() - target.length() + 1; i++) {
            int j = 0;
            for (; j < target.length(); j++)
                if (target.charAt(j) != source.charAt(i + j))
                    break;
            if (j == target.length()) return i;
        }
        return -1;
    }

    /**
     * KMP算法
     * 测试: LeetCode: 18ms
     *
     * @see
     * <a href="http://www.ruanyifeng.com/blog/2013/05/Knuth%E2%80%93Morris%E2%80%93Pratt_algorithm.html">kmp算法理解</a>
     * 分析: 1. next数组计算: 已知next[i-1] = j,利用递归的思想求出next[i]的值
     */
    public static int kmp(String source, String target) {
        int[] next = next(target);
        int i = 0, j = 0;
        while (i < source.length() && j < target.length()) {
            if (source.charAt(i) == target.charAt(j)) {
                i++;
                j++;
            } else if (j == 0) {
                i++;
            } else {
                j = next[j - 1];
            }
        }
        if (j == target.length())
            return i - j;
        return -1;
    }

    public static int[] next(String target) {
        int[] next = new int[target.length()];
        int i = 1, j = 0;
        while (i < target.length()) {
            if (target.charAt(i) == target.charAt(j)) {
                next[i] = j + 1;
                j = next[i];
                i++;
            } else if (j == 0) {
                next[i] = 0;
                i++;
            } else {
                j = next[j - 1];
            }
        }
        return next;
    }

    public static void main(String[] args) {

    }
}

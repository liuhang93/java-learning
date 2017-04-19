package offer;

/**
 * Created by liuhang on 2017/4/17.
 */
public class Solution53 {
    public boolean isNumeric(char[] str) {
        String string = String.valueOf(str);
        return string.matches("[+-]?[0-9]*(.[0-9]*)?([eE][+-]?[0-9]+)?");
    }

}

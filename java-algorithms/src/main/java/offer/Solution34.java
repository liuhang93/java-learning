package offer;

/**
 * Created by liuhang on 2017/4/12.
 */
public class Solution34 {
    public int FirstNotRepeatingChar(String str) {
        int index = -1;
        if (str == null || str.length() == 0) {
            return index;
        }
        int[] arr = new int[128];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (arr[str.charAt(i)] == 1) {
                index = i;
                break;
            }
        }
        return index;
    }
}

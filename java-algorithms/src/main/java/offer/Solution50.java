package offer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liuhang on 2017/4/15.
 */
public class Solution50 {
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        boolean flag = false;
        duplication[0] = -1;
        if(numbers == null || numbers.length == 0){
            return flag;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int elem : numbers) {
            if (map.get(elem)==null) {
                map.put(elem,1);
            }else {
                duplication[0] = elem;
                flag = true;
            }
        }
        return flag;
    }
}

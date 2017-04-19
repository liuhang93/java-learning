package offer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by liuhang on 2017/4/12.
 * 把数组排成最小的数
 */
public class Solution32 {
    public String PrintMinNumber(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int elem : numbers) {
            list.add(elem);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String str1 = o1 + "" + o2;
                String str2 = o2 + "" + o1;
                return str1.compareTo(str2);

            }
        });
        String result = "";
        for (int i : list) {
            result += i;
        }
        return result;
    }

    @Test
    public void test() {
        int[] arr = new int[]{3, 32, 321};
        System.out.println(PrintMinNumber(arr));
    }
}

package interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by liuhang on 2017/3/25.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String[] str1 = new String[n];
        String[] str2 = new String[m];
//        String cat = in.nextLine();
        for (int i = 0; i < n; i++) {
            str1[i] = in.nextLine();
        }
        for (int i = 0; i < m; i++) {
            str2[i] = in.nextLine();
        }
        Map<String, Integer>[] map1 = new HashMap[n];
        Map<String, Integer>[] map2 = new HashMap[m];
        for (int i = 0; i < n; i++) {
            String s = str1[i];
            String[] arr = s.split("[ ]");
            map1[i] = new HashMap<String, Integer>();
            for (String str : arr) {
                str = str.toUpperCase();
                map1[i].put(str, 0);
            }
        }
        for (int i = 0; i < m; i++) {
            int[] count = new int[n];
            String s = str2[i];
            String[] arr = s.split("[ ]");
            for (String str : arr) {
                str = str.toUpperCase();
                for (int k = 0; k < n; k++) {
                    if (map1[k].get(str) != null) {
                        count[k]++;
                    }
                }
            }
            int max = 0;
            for (int x = 0; x < n; x++) {
                if (count[x] > count[max]) {
                    max = x;
                }
            }
            System.out.println(str1[max]);
        }
    }
}

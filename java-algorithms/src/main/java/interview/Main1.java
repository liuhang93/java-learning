package interview;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by liuhang on 2017/3/25.
 */
public class Main1 {
    public static void main(String[] args) {
        String str = "1,3|4,14";
        String[] strings = str.split(",");
        System.out.println("ha");
    }

    public static int getSumOfKthToTail(LinkedList<Integer> head, int k) {
        if (head == null || k <= 0) {
            return 0;
        }
        Iterator<Integer> iterator = head.iterator();
        Iterator<Integer> iterator1 = head.iterator();
        int sum = 0;
        int i = 1;
        while (i < k && iterator.hasNext()) {
            iterator.next();
            i++;
        }
        while (iterator.hasNext()) {
            iterator.next();
            iterator1.next();
        }
        while (iterator1.hasNext()) {
            sum += iterator1.next();
        }
        return sum;

    }
}
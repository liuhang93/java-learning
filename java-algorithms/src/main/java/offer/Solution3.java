package offer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by liuhang on 2017/3/14.
 * 剑指offer 第三题 从尾到头打印链表
 */
public class Solution3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<>();
        while (listNode != null) {
            result.add(listNode.val);
            listNode = listNode.next;
        }
        Collections.reverse(result);
        return result;
    }
}



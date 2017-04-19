package offer;

/**
 * Created by liuhang on 2017/4/17.
 * 删除重复结点:
 * 重复结点不保留;
 * 重复结点保留;
 * 重点看
 */
public class Solution56 {
    //重复结点保留
    public ListNode deleteDuplication1(ListNode pHead) {
        if (pHead == null) {
            return pHead;
        }
        int cur = pHead.val;
        ListNode node = pHead;
        while (node.next != null) {
            int temp = node.next.val;
            if (temp == cur) {
                ListNode p = node.next.next;
                node.next = p;
            } else {
                cur = temp;
                node = node.next;
            }
        }
        return pHead;
    }

    //重复结点不保留
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) {
            return pHead;
        }

        ListNode node = pHead;
        ListNode preNode = new ListNode(0);
        preNode.next = pHead;
        ListNode root = preNode;
        while (node != null) {
            ListNode tempNode = node;
            int count = 0;
            while (tempNode.next != null) {
                if (tempNode.next.val == tempNode.val) {
                    count++;
                    tempNode = tempNode.next;
                } else {
                    break;
                }
            }
            if (count > 0) {
                preNode.next = tempNode.next;
                node = tempNode.next;
            } else {
                preNode = node;
                node = node.next;
            }

        }
        return root.next;
    }
}

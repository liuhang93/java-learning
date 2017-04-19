package offer;

/**
 * Created by liuhang on 2017/4/15.
 */
public class Solution57 {
    TreeLinkNode GetNext(TreeLinkNode node) {
        if (node == null) {
            return null;
        }
        if (node.right != null) {//如果有右子树，则找右子树的最左节点
            TreeLinkNode temp = node.right;
            while (temp.left != null) {
                temp = temp.left;
            }
            return temp;
        }
        while (node.next != null) {//没右子树，则找第一个当前节点是父节点左孩子的节点
            if (node.next.left == node) return node.next;
            node = node.next;
        }
        return null;
    }

}

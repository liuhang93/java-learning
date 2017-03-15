package offer;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by liuhang on 2017/3/15. 剑指offer 第四题 重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,
 * 7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class Solution4 {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null | pre.length == 0 || in.length == 0) {
            return null;
        }
        return myReConstruct(pre, 0, pre.length - 1, in, 0, in.length - 1);

    }

    private TreeNode myReConstruct(int[] pre, int preStart, int preEnd, int[] in, int inStart,
                                   int inEnd) {
        TreeNode root = new TreeNode(pre[preStart]);
        int leftLength = 0;
        int rightLength = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (pre[preStart] == in[i]) {
                leftLength = i - inStart;
                rightLength = inEnd - i;
                break;
            }
        }
        if (leftLength > 0) {
            root.left = myReConstruct(pre, preStart + 1, preStart + leftLength, in,
                    inStart, inStart + leftLength - 1);
        }
        if (rightLength > 0) {
            root.right = myReConstruct(pre, preEnd - rightLength + 1, preEnd, in,
                    inEnd - rightLength + 1, inEnd);
        }
        return root;
    }

    @Test
    public void test() {
        int[] pre = {1, 2, 3, 4, 5, 6, 7};
        int[] in = {3, 2, 4, 1, 6, 5, 7};
        TreeNode treeNode = reConstructBinaryTree(pre, in);
        layerSearch(treeNode);
    }

    //二叉树层序遍历，用队列实现
    private void layerSearch(TreeNode node) {
        if (node == null) {
            return;
        }
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.addLast(node);
        while (!deque.isEmpty()) {
            TreeNode node1 = deque.pollFirst();
            System.out.print(node1.val + "->");
            if (node1.left != null) {
                deque.addLast(node1.left);
            }
            if (node1.right != null) {
                deque.addLast(node1.right);
            }
        }
    }
}

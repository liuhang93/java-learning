package offer;

import java.util.ArrayDeque;

/**
 * 剑指offer： 二叉搜索树和双向链表.
 * 二叉搜索树,中序遍历，可得到有序。
 */
public class Solution25 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;
        TreeNode root = pRootOfTree;
        TreeNode left = null;
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.addLast(root);
                root = root.left;
            }
            TreeNode temp = stack.pollLast();
            root = temp.right;
            temp.left = left;
            left = temp;
        }
        TreeNode right = null;
        TreeNode result = null;
        while (left != null) {
            left.right = right;
            right = left;
            if (left.left == null) {
                result = left;
            }
            left = left.left;

        }
        return result;
    }
}
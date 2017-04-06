package binaryTree;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by liuhang on 2017/3/23.
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/#/description
 */
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (hasTwoNode(root, p, q)) {
                if (hasTwoNode(root.left, p, q)) {
                    root = root.left;
                } else if (hasTwoNode(root.right, p, q)) {
                    root = root.right;
                } else {
                    return root;
                }
            } else {
                break;
            }
        }
        return null;
    }

    private boolean hasTwoNode(TreeNode root, TreeNode p, TreeNode q) {
        boolean hasP = false;
        boolean hasQ = false;
        Deque<TreeNode> queue = new ArrayDeque<>();
        if (root != null) queue.addLast(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.pollFirst();
            if (temp == p) {
                hasP = true;
            } else if (temp == q) {
                hasQ = true;
            }
            if (temp.left != null) queue.addLast(temp.left);
            if (temp.right != null) queue.addLast(temp.right);
        }
        return hasP && hasQ;
    }

}

package binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by liuhang on 2017/1/8.
 * 前序遍历
 */
public class PreorderTraversal {
    /**
     * 前序遍历-方法一: 迭代法,运用栈
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
        return result;
    }

    public static void main(String[] args) {
    }
}

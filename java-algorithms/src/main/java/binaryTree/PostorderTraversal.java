package binaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Created by liuhang on 2017/1/8.
 */
public class PostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        TreeNode previous = null;
        while (!stack.isEmpty()) {
            TreeNode current = stack.peek();
            boolean noChild = (current.left == null && current.right == null);
            boolean childVisited = false;
            if (previous != null || (current.left == previous || current.right == previous)) {
                childVisited = true;
            }
            if (noChild || childVisited) {
                result.add(current.val);
                stack.pop();
                previous = current;
            } else {
                if (current.right != null) stack.push(current.right);
                if (current.left != null) stack.push(current.left);
            }
        }
        return result;
    }
}

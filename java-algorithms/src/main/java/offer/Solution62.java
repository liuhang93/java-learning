package offer;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by liuhang on 2017/4/18.
 */
public class Solution62 {
    TreeNode KthNode(TreeNode pRoot, int k) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        int count = 0;
        TreeNode node = null;
        while (pRoot != null || !stack.isEmpty()) {
            while (pRoot != null) {
                stack.addLast(pRoot);
                pRoot = pRoot.left;
            }
            node = stack.pollLast();
            pRoot = node.right;
            count++;
            if (count == k) {
                break;
            }
        }
        if (count == k)
            return node;
        else
            return null;
    }

}

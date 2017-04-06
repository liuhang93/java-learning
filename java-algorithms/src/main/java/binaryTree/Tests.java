package binaryTree;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by liuhang on 2017/3/23.
 */
public class Tests {

    public final int Max = Integer.MAX_VALUE;

    //根据一个顺序存储的数组，构造二叉树；
    public TreeNode createTree(int[] array) {
        TreeNode root = new TreeNode(array[0]);
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.addLast(root);
        int i = 1;
        while (i < array.length && !queue.isEmpty()) {
            TreeNode node = queue.pollFirst();
            node.left = new TreeNode(array[i]);
            node.right = new TreeNode(array[i + 1]);
            queue.addLast(node.left);
            queue.addLast(node.right);
            i += 2;
        }
        queue.clear();
        queue.addLast(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.pollFirst();
            if (node.left == null && node.right == null) break;
            if (node.left.val == Max) {
                node.left = null;
            } else {
                queue.addLast(node.left);
            }
            if (node.right.val == Max) {
                node.right = null;
            } else {
                queue.addLast(node.right);
            }
        }
        return root;
    }

    @Test
    public void testLowestCommonAncestor() {
        int[] array = new int[]{1, 2, 3, Max, 4, 5, Max, Max, Max, 6, Max, Max, 7};
        TreeNode root = createTree(array);
        System.out.println("success");
    }
}

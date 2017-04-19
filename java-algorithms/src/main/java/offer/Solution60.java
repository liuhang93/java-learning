package offer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/**
 * Created by liuhang on 2017/4/19.
 */
public class Solution60 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if (pRoot == null) {
            return list;
        }
        Deque<TreeNode> queue1 = new ArrayDeque<>();
        Deque<TreeNode> queue2 = new ArrayDeque<>();
        int currentLevel = 1;
        queue1.addLast(pRoot);
        while (!queue1.isEmpty() || !queue2.isEmpty()) {
            if (currentLevel % 2 != 0) {
                ArrayList<Integer> temp = new ArrayList<>();
                while (!queue1.isEmpty()) {
                    TreeNode node = queue1.pollFirst();
                    temp.add(node.val);
                    if (node.left != null) queue2.addLast(node.left);
                    if (node.right != null) queue2.addLast(node.right);
                }
                list.add(temp);
                currentLevel++;
            } else {
                ArrayList<Integer> temp = new ArrayList<>();
                while (!queue2.isEmpty()) {
                    TreeNode node = queue2.pollFirst();
                    temp.add(node.val);
                    if (node.left != null) queue1.addLast(node.left);
                    if (node.right != null) queue1.addLast(node.right);
                }
                list.add(temp);
                currentLevel++;
            }
        }
        return list;
    }
}

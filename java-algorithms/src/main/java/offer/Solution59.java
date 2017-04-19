package offer;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * Created by liuhang on 2017/4/19.
 */
public class Solution59 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if (pRoot == null) {
            return list;
        }
        int currentLevel = 1;
        ArrayDeque<TreeNode> stack1 = new ArrayDeque<>();
        ArrayDeque<TreeNode> stack2 = new ArrayDeque<>();
        stack1.addLast(pRoot);

        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            if (currentLevel % 2 != 0) {
                ArrayList<Integer> temp = new ArrayList<>();
                while (!stack1.isEmpty()) {
                    TreeNode node = stack1.pollLast();
                    temp.add(node.val);
                    if (node.left != null) stack2.addLast(node.left);
                    if (node.right != null) stack2.addLast(node.right);
                }
                list.add(temp);
                currentLevel++;
            } else {
                ArrayList<Integer> temp = new ArrayList<>();
                while (!stack2.isEmpty()) {
                    TreeNode node = stack2.pollLast();
                    temp.add(node.val);
                    if (node.right != null) stack1.addLast(node.right);
                    if (node.left != null) stack1.addLast(node.left);
                }
                list.add(temp);
                currentLevel++;
            }
        }
        return list;
    }
}

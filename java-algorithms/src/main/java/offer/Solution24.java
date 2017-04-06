package offer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by liuhang on 2017/3/30.
 * 二叉树中和为某一值得路径
 */
public class Solution24 {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> path = new ArrayList<>();
        if (root == null) return path;
        Deque<TreeNode> stack = new ArrayDeque<>();
        Map<TreeNode, TreeNode> map1 = new HashMap<>();//记录每个节点的父节点
        Map<TreeNode, Integer> map2 = new HashMap<>();//记录根节点到当前节点的路径和
        stack.addLast(root);
        map1.put(root, null);
        map2.put(root, root.val);
        while (!stack.isEmpty()) {
            int sum = 0;
            TreeNode temp = stack.pollLast();
            if (map1.get(temp) != null) {
                sum = map2.get(map1.get(temp));
                sum += temp.val;
            } else {
                sum = temp.val;
            }
            map2.put(temp, sum);
            if (temp.left == null && temp.right == null && sum == target) {
                ArrayList<Integer> p = new ArrayList<>();
                TreeNode temp1 = temp;
                while (temp1 != null) {
                    p.add(temp1.val);
                    temp1 = map1.get(temp1);
                }
                Collections.reverse(p);
                path.add(p);
            }
            if (temp.right != null) {
                stack.addLast(temp.right);
                map1.put(temp.right, temp);
            }
            if (temp.left != null) {
                stack.addLast(temp.left);
                map1.put(temp.left, temp);
            }
        }
        return path;
    }
}

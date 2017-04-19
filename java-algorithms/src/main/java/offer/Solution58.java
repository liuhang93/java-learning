package offer;

/**
 * Created by liuhang on 2017/4/15.
 * 判断二叉树是否对称
 * 分成两个树,一个前序遍历 一个对称前序遍历, 然后进行比较
 */
public class Solution58 {
    boolean isSymmetrical(TreeNode pRoot) {
        return help(pRoot, pRoot);

    }

    boolean help(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return help(p.left, q.right) && help(p.right, q.left);
    }
}

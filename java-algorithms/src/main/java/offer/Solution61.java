package offer;

/**
 * Created by liuhang on 2017/4/20.
 */
public class Solution61 {
    int index = -1;

    String Serialize(TreeNode root) {
        if (root == null) {
            return "#,";
        }
        String str = root.val + ",";
        str = str + Serialize(root.left);
        str = str + Serialize(root.right);
        return str;
    }

    TreeNode Deserialize(String str) {
        index++;
        if (index >= str.length()) {
            return null;
        }
        String[] strs = str.split(",");
        String s = strs[index];
        TreeNode node = null;
        if (!s.equals("#")) {
            node = new TreeNode(Integer.valueOf(s));
            node.left = Deserialize(str);
            node.right = Deserialize(str);
        }
        return node;
    }
}

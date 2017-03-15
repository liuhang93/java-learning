package interview;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by liuhang on 2017/3/14.
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> inputs = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        while (line != null && !line.isEmpty()) {
            int value = Integer.parseInt(line.trim());
            if (value == 0) break;
            inputs.add(value);
            line = in.nextLine();
        }
        int[] A = new int[inputs.size()];
        for (int i = 0; i < inputs.size(); i++) {
            A[i] = inputs.get(i).intValue();
        }
        int res = resolve(A);

        System.out.println(String.valueOf(res));
    }

    // write your code here
    public static int resolve(int[] A) {
        int result = 0;
        TreeNode node = new TreeNode(0);
        TreeNode currentNode = node;

        //构造二叉树
        for (int i : A) {
            int l = i / 100;
            int p = i / 10 % 10;
            int v = i % 100;

        }

        //遍历求和
        return result;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
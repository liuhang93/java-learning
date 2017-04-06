package offer;

/**
 * Created by liuhang on 2017/3/27.
 * 包含min函数的栈
 */

import java.util.Stack;

public class Solution20 {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> helpStack = new Stack<>();
    private int minNum = Integer.MAX_VALUE;

    public void push(int node) {
        minNum = node < minNum ? node : minNum;
        stack.push(node);
        helpStack.push(minNum);
    }

    public void pop() {
        stack.pop();
        helpStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return helpStack.peek();
    }
}


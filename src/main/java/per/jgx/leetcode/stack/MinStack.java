package per.jgx.leetcode.stack;

import java.util.Stack;

/**
 * 实现一个可以获取最小值的栈，要求O(1)复杂度
 * 使用双栈，一个数据栈，一个最小值栈
 *
 * @author Jiang Guangxing
 */
public class MinStack {
    public MinStack() {
        this.s = new Stack<>();
        this.min = new Stack<>();
    }

    private final Stack<Integer> s;
    private final Stack<Integer> min;

    public int getMin() {
        return min.peek();
    }

    public int pop() {
        min.pop();
        return s.pop();
    }

    public void push(int v) {
        if (min.isEmpty()) {
            min.push(v);
        } else {
            min.push(Math.min(min.peek(), v));
        }
        s.push(v);
    }

    // 6 2 1 3 4 5
    public static void main(String[] args) {
        MinStack s = new MinStack();
        s.push(3);
        s.push(1);
        s.push(2);
        s.push(6);
        s.push(4);
        System.out.println(s.getMin());
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s.getMin());
    }
}

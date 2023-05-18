package per.jgx.leetcode.queue;

import java.util.Stack;

/**
 * 导数据原则
 * 当to为空时，一次性把from中的元素全部导入to
 * <p>
 * 导入时机无所谓，可以在push数据时，可以在pop数据时
 *
 * @author Jiang Guangxing
 * @see per.jgx.leetcode.stack.QueueStack
 */
public class StackQueue<E> {
    // 1,2,3
    private final Stack<E> from;
    // 3,2,1
    private final Stack<E> to;

    public StackQueue() {
        from = new Stack<>();
        to = new Stack<>();
    }

    public void offer(E e) {
        from.push(e);
        from2to();
    }

    public E poll() {
        from2to();
        return to.pop();
    }

    public boolean isEmpty() {
        return from.isEmpty() && to.isEmpty();
    }

    private void from2to() {
        if (!to.isEmpty()) {
            return;
        }
        while (!from.isEmpty()) {
            to.push(from.pop());
        }
    }

    public static void main(String[] args) {
        StackQueue<Integer> q = new StackQueue<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        System.out.println(q.poll());
        q.offer(5);
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
        System.out.println(q.poll());
    }
}

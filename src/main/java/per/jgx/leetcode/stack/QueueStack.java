package per.jgx.leetcode.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列实现栈
 * 实现图的深度优先遍历，要求使用队列实现。
 * 正常情况下，深度优先遍历使用栈，所以使用队列实现栈即可。
 * 宽度优先遍历则相反
 * <p>
 * 实现流程：与双栈实现队列的方式不同，而且时间复杂度高
 * push：哪个不为空，往哪个里push
 * pop：选择不为空的队列，将所有元素取出，放入另一个队列，只保留最后一个，弹出
 *
 * @author Jiang Guangxing
 */
public class QueueStack<E> {
    private Queue<E> q1;
    private Queue<E> q2;

    public QueueStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public E pop() {
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }
        Queue<E> t = q1;
        q1 = q2;
        q2 = t;
        return q2.poll();
    }

    public void push(E e) {
        q1.offer(e);
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        QueueStack<Integer> s = new QueueStack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
//        System.out.println(s.pop());
        s.push(5);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}

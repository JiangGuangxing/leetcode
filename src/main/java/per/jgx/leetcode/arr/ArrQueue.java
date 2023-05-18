package per.jgx.leetcode.arr;

/**
 * 使用数组实现队列，当数元素未满时可以添加元素
 * google常考提，一定要多写几遍
 *
 * @author Jiang Guangxing
 */
public class ArrQueue {
    public static void main(String[] args) {
        ArrQueue q = new ArrQueue(5);
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        System.out.println(q.take());
        q.offer(6);
        int i = 7;
        while (!q.isEmpty()) {
            System.out.println(q.take());
            if (i <= 15) {
                q.offer(i++);
            }
        }
    }

    private final int[] arr;
    private int begin;
    private int end;
    // 使用size记录当前队列元素数量，避免维护begin和end的复杂关系
    private int size;

    public ArrQueue(int limit) {
        arr = new int[limit];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void offer(int v) {
        if (size == arr.length) {
            throw new RuntimeException("队列已满");
        }
        size++;
        arr[end] = v;
        end = nextIndex(end);
    }

    public int take() {
        if (size == 0) {
            throw new RuntimeException("队列为空");
        }
        size--;
        int v = arr[begin];
        begin = nextIndex(begin);
        return v;
    }

    private int nextIndex(int i) {
        return i == arr.length - 1 ? 0 : i + 1;
    }

}

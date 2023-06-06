package per.jgx.leetcode.topnterview150.easy;

import per.jgx.leetcode.ListNode;

/**
 * <a href="https://leetcode.cn/problems/linked-list-cycle/?envType=study-plan-v2&envId=top-interview-150">...</a>
 *
 * @author Jiang Guangxing
 */
public class HasCycle {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode listNode = new ListNode(2);
        head.next = listNode;
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = listNode;
        System.out.println(hasCycle(head));
    }

    /**
     * 输入：head = [3,2,0,-4], pos = 1
     * 输出：true
     * 解释：链表中有一个环，其尾部连接到第二个节点。
     * <p>
     * 典型快慢指针题目
     */
    public static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        while (head != null && fast != null && fast.next != null) {
            if (head == fast.next) {
                return true;
            }
            head = head.next;
            fast = fast.next.next;
        }
        return false;
    }
}

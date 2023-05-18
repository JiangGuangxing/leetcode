package per.jgx.leetcode.lianbiao;

import per.jgx.leetcode.ListNode;

/**
 * @author Jiang Guangxing
 */
public class RemoveValue {
    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);
        l.next.next.next = new ListNode(4);
        ListNode.printNode(deleteNode(l, 1));
    }

    public static ListNode deleteNode(ListNode head, int val) {
        // 添加一个任意头结点，这样就不需要对头节点单独处理了
        ListNode ans = new ListNode(0);
        ans.next = head;
        head = ans;
        while (head != null) {
            if (head.next != null && head.next.val == val) {
                head.next = head.next.next;
            }
            head = head.next;
        }
        return ans.next;
    }

}

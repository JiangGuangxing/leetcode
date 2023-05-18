package per.jgx.leetcode.lianbiao;


import per.jgx.leetcode.ListNode;

/**
 * 单链表反转
 * 多写多复习
 * 链表无小事
 *
 * @author Jiang Guangxing
 */
public class Reverse {
    public static void main(String[] args) {

    }

    // 1->2->3->4->null
    // 4->3->2->1->null
    public static ListNode reverse(ListNode h) {
        ListNode ans = null;
        while (h != null) {
            ListNode next = h.next;
            h.next = ans;
            ans = h;
            h = next;
        }
        return ans;
    }
}

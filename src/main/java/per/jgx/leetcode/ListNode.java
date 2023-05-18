package per.jgx.leetcode;

/**
 * @author Jiang Guangxing
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void printNode(ListNode h) {
        while (h != null) {
            System.out.print(h.val + " ");
            h = h.next;
        }
    }
}

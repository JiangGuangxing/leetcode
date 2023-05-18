package per.jgx.leetcode.example.zhongdeng;

import per.jgx.leetcode.ListNode;

/**
 * https://leetcode.cn/problems/add-two-numbers/
 *
 * @author Jiang Guangxing
 */
public class Test {
    //[2,4,3]
    //[5,6,4]
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode.printNode(addTwoNumbers(l1, l2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int a = 0;//进位
        ListNode ans = new ListNode(0);
        ListNode tmp = ans;
        while (l1 != null || l2 != null) {
            int sum = a;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            a = sum > 9 ? 1 : 0;
            tmp.next = new ListNode(sum % 10);
            tmp = tmp.next;
        }
        if (a != 0) {
            tmp.next = new ListNode(1);
        }
        return ans.next;
    }
}

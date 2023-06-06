package per.jgx.leetcode.topnterview150.easy;

import per.jgx.leetcode.ListNode;

/**
 * <a href="https://leetcode.cn/problems/merge-two-sorted-lists/?envType=study-plan-v2&envId=top-interview-150">...</a>
 *
 * @author Jiang Guangxing
 */
public class MergeTwoLists {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        ListNode listNode = mergeTwoLists(list1, list2);
        ListNode.printNode(listNode);
    }

    /**
     * 归并排序
     */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 占位
        ListNode ans = new ListNode(0);
        ListNode t = ans;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                t.next = list1;
                list1 = list1.next;
            } else {
                t.next = list2;
                list2 = list2.next;
            }
            t = t.next;
        }
        t.next = list1 != null ? list1 : list2;
        return ans.next;
    }
}

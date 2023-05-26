package per.jgx.leetcode.topnterview150;

import per.jgx.leetcode.Utils;

/**
 * https://leetcode.cn/problems/remove-element/?envType=study-plan-v2&id=top-interview-150
 * 移除元素
 *
 * @author Jiang Guangxing
 */
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        System.out.println(new RemoveElement().removeElement(nums, 3));
        Utils.printArr(nums);
    }

    public int removeElement(int[] nums, int val) {
        // 遍历一次，相等的直接往前面放即可，因为前面的都遍历过了，不会收到影响
        int idx = 0;
        for (int x : nums) {
            if (x != val) {
                nums[idx++] = x;
            }
        }
        return idx;
    }
}

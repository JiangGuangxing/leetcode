package per.jgx.leetcode.topnterview150.easy;

import per.jgx.leetcode.Utils;

/**
 * https://leetcode.cn/problems/remove-duplicates-from-sorted-array/?envType=study-plan-v2&envId=top-interview-150
 *
 * @author Jiang Guangxing
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2, 3};
        System.out.println(removeDuplicates(nums));
        Utils.printArr(nums);
    }

    public static int removeDuplicates(int[] nums) {
        int idx = 0;
        for (int x : nums) {
            // 因为是升序数组，所以只考虑当前位置是否与前面的是否相等即可
            if (idx < 1 || nums[idx - 1] != x) {
                nums[idx++] = x;
            }
        }
        return idx;
    }
}

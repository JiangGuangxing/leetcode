package per.jgx.leetcode.topnterview150.mid;

import per.jgx.leetcode.Utils;

/**
 * https://leetcode.cn/problems/rotate-array/?envType=study-plan-v2&envId=top-interview-150
 *
 * @author Jiang Guangxing
 */
public class Rotate {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        rotate(nums, 2);
        Utils.printArr(nums);
    }

    // 1 2 3
    // 3 1 2
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] newArr = new int[n];
        for (int i = 0; i < n; ++i) {
            newArr[(i + k) % n] = nums[i];
        }
        System.arraycopy(newArr, 0, nums, 0, n);
    }
}

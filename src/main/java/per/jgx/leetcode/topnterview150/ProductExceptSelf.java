package per.jgx.leetcode.topnterview150;

import per.jgx.leetcode.Utils;

/**
 * https://leetcode.cn/problems/product-of-array-except-self/?envType=study-plan-v2&envId=top-interview-150
 *
 * @author Jiang Guangxing
 */
public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] arr = productExceptSelf(new int[]{1, 2, 3, 4});
        Utils.printArr(arr);
    }

    /**
     * 前缀积*后缀积
     * 输入: nums = [1,2,3,4]
     * 输出: [24,12,8,6]
     */
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = 1;
        // 前缀积
        // 1 1 2 6
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }
        // 记录后缀乘积
        int suf = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            ans[i] = suf * ans[i];
            suf *= nums[i];
        }
        return ans;
    }
}

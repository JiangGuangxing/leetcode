package per.jgx.leetcode.topnterview150.mid;

import java.util.Arrays;

/**
 * <a href="https://leetcode.cn/problems/house-robber/?envType=study-plan-v2&envId=top-interview-150">...</a>
 *
 * @author Jiang Guangxing
 */
public class Rob {
    public static void main(String[] args) {
        System.out.println(new Rob().rob(new int[]{2, 7, 9, 3, 1}));
    }

    public int rob(int[] nums) {
        dp = new int[nums.length + 1];
        Arrays.fill(dp, -1);
        return process(nums, 0);
    }

    public int process(int[] nums, int index) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        if (index > nums.length - 1) {
            return 0;
        }
        if (dp[index] != -1) {
            return dp[index];
        }
        int res1 = nums[index] + process(nums, index + 2);
        // index 位置不偷, 偷 index + 1
        int res2 = process(nums, index + 1);
        return dp[index] = Math.max(res1, res2);
    }

    private int[] dp;

    public int robDp(int[] nums) {
        dp = new int[nums.length + 1];
        Arrays.fill(dp, -1);


        return dp[0];
    }

}

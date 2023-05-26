package per.jgx.leetcode.topnterview150;

import java.util.Arrays;

/**
 * https://leetcode.cn/problems/jump-game/?envType=study-plan-v2&envId=top-interview-150
 *
 * @author Jiang Guangxing
 */
public class CanJump {
    public static void main(String[] args) {
        System.out.println(canJump2(new int[]{2, 3, 1, 1, 4}));
        System.out.println(canJump2(new int[]{3, 2, 1, 0, 4}));
        System.out.println(canJump2(new int[]{1, 1, 1, 0}));
    }

    public static boolean canJump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return process(nums, 0, dp);
    }

    /**
     * 返回第i个位置是否能调到最后
     * 输入：nums = [2,3,1,1,4]
     * 输出：true
     * 解释：可以先跳 1 步，从下标 0 到达下标 1, 然后再从下标 1 跳 3 步到达最后一个下标。
     */
    public static boolean process(int[] nums, int i, int[] dp) {
        if (nums[i] >= nums.length - 1 - i) {
            return true;
        }
        if (dp[i] != -1) {
            return dp[i] == 1;
        }
        for (int t = 0; t < nums[i]; t++) {
            if (process(nums, i + t + 1, dp)) {
                dp[i] = 1;
                return true;
            }
        }
        dp[i] = 0;
        return false;
    }

    // dp
    public static boolean canJump2(int[] nums) {
        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= nums.length - 1 - i || i == nums.length - 1) {
                dp[i] = 1;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (dp[i] != 1) {
                for (int t = 0; t < nums[i]; t++) {
                    if (dp[i + t + 1] == 1) {
                        dp[i] = 1;
                        break;
                    }
                }
            }
        }
        return dp[0] == 1;
    }
}

package per.jgx.leetcode.topnterview150.mid;

import java.util.Arrays;

/**
 * <a href="https://leetcode.cn/problems/jump-game-ii/?envType=study-plan-v2&envId=top-interview-150">...</a>
 *
 * @author Jiang Guangxing
 */
public class Jump {
    public static void main(String[] args) {
        System.out.println(jump2(new int[]{2, 3, 0, 1, 4}));
        System.out.println(jump(new int[]{2, 3, 0, 1, 4}));
    }

    /**
     * 输入: nums = [2,3,1,1,4]
     * 输出: 2
     * 解释: 跳到最后一个位置的最小跳跃数是 2。
     * 从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。
     */
    public static int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return process(nums, 0, dp);
    }

    public static int process(int[] nums, int i, int[] dp) {
        if (i == nums.length - 1) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int ans = Integer.MAX_VALUE - 1;// 减一的目的是为了防止MAX_VALUE+1溢出
        for (int j = 1; j <= nums[i]; j++) {
            ans = Math.min(ans, process(nums, i + j, dp) + 1);// 加一是因为要从i跳到j
        }
        dp[i] = ans;
        return ans;
    }

    public static int jump2(int[] nums) {
        int[] dp = new int[nums.length];
//        dp[nums.length - 1] = 0;
        // nums.length - 1位置已经设置过，从nums.length - 2开始处理
        for (int i = nums.length - 2; i >= 0; i--) {
            dp[i] = Integer.MAX_VALUE - 1;
            for (int j = 1; j <= nums[i]; j++) {
                if (i + j < nums.length) {
                    dp[i] = Math.min(dp[i], dp[i + j] + 1);
                }
            }
        }
        return dp[0];
    }
}

package per.jgx.leetcode.topnterview150.easy;

/**
 * <a href="https://leetcode.cn/problems/climbing-stairs/?envType=study-plan-v2&envId=top-interview-150">...</a>
 *
 * @author Jiang Guangxing
 */
public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(climbStairsDp(3));
    }

    private int[] dp;

    public int climbStairs(int n) {
        if (dp == null) {
            dp = new int[n + 1];
        }
        if (n <= 2) {
            return n;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        // 走到第n阶有两种方法，一种是从第n-1阶走1步到n，另一种是从第n-2阶走2步到n
        // 走到第n-1可以有climbStairs(n - 1)方法，走到第n-2可以有climbStairs(n - 2)方法，加在一起就是总的走法
        return dp[n] = climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static int climbStairsDp(int n) {
        if (n <= 2) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

}

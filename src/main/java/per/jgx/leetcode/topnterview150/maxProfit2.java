package per.jgx.leetcode.topnterview150;

import java.util.Arrays;

/**
 * https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii/?envType=study-plan-v2&envId=top-interview-150
 *
 * @author Jiang Guangxing
 */
public class maxProfit2 {
    public static void main(String[] args) {
        System.out.println(maxProfit2(new int[]{7, 1, 5, 3, 6, 4}));
    }

    /**
     * 输入：prices = [7,1,5,3,6,4]
     * 输出：7
     * <p>
     * 解释：在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5 - 1 = 4 。
     * 随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6 - 3 = 3 。
     * 总利润为 4 + 3 = 7 。
     */
    public static int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return process(prices, prices.length - 1, 0, dp);
    }

    /**
     * @param i    第i天
     * @param hold 是否持有
     */
    private static int process(int[] prices, int i, boolean hold) {
        if (i == 0) {
            // 第一天如果持有就要买入，收入是-prices[0]，如果不持有，也就是不买入，收入为0
            return hold ? -prices[0] : 0;
        }
        // 三种情况：买、卖、持有
        int max = process(prices, i - 1, hold);// 不买也不卖
        if (hold) {
            // 今天是持有的，说明要买入（昨天是不持有的状态，今天买）
            return Math.max(max, process(prices, i - 1, false) - prices[i]);// 买
        } else {
            // 今天是不持有的，说明要卖出（昨天是持有的状态，今天卖）
            return Math.max(max, process(prices, i - 1, true) + prices[i]);// 卖
        }
    }

    /**
     * 记忆化搜索
     */
    private static int process(int[] prices, int i, int hold, int[][] dp) {
        if (i == 0) {
            // 第一天如果持有就要买入，收入是-prices[0]，如果不持有，也就是不买入，收入为0
            return hold == 1 ? -prices[0] : 0;
        }
        if (dp[i][hold] != -1) {
            return dp[i][hold];
        }
        // 三种情况：买、卖、持有
        int max = process(prices, i - 1, hold, dp);// 不买也不卖
        if (hold == 1) {
            // 今天是持有的，说明要买入（昨天是不持有的状态，今天买）
            return dp[i][hold] = Math.max(max, process(prices, i - 1, 0, dp) - prices[i]);// 买
        } else {
            // 今天是不持有的，说明要卖出（昨天是持有的状态，今天卖）
            return dp[i][hold] = Math.max(max, process(prices, i - 1, 1, dp) + prices[i]);// 卖
        }
    }

    /**
     * dp
     */
    public static int maxProfit2(int[] prices) {
        int[][] dp = new int[prices.length][2];
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = i == 1 ? -prices[0] : 0;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                int max = dp[i - 1][j];
                if (j == 1) {
                    dp[i][j] = Math.max(max, dp[i - 1][0] - prices[i]);
                } else {
                    dp[i][j] = Math.max(max, dp[i - 1][1] + prices[i]);
                }
            }
        }
        return dp[prices.length - 1][0];
    }
}

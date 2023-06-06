package per.jgx.leetcode.topnterview150.easy;

/**
 * https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/?envType=study-plan-v2&envId=top-interview-150
 *
 * @author Jiang Guangxing
 */
public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    // 输入：[7,1,5,3,6,4]
    // 输出：5
    public static int maxProfit(int[] prices) {
        // 最大收益
        int max = 0;
        // 第i天以前的最小值
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            // 第i天的最大收益=第i-1天的最大收益和第i天-第i天以前最小值之间的较大值
            max = Math.max(prices[i] - min, max);
            if (prices[i] < min) {
                // 更新第i天以前的最小值
                min = prices[i];
            }
        }
        return max;
    }
}

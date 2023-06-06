package per.jgx.leetcode.topnterview150.easy;

/**
 * <a href="https://leetcode.cn/problems/single-number/?envType=study-plan-v2&envId=top-interview-150">...</a>
 *
 * @author Jiang Guangxing
 */
public class SingleNumber {
    public static void main(String[] args) {

    }

    /**
     * 异或，出现两次的异或之后是0，只出现一次的异或0还是自身
     * 10^10 = 00
     * 10^00 = 10
     */
    public static int singleNumber(int[] nums) {
        int ans = 0;
        for (int n : nums) {
            ans ^= n;
        }
        return ans;
    }
}

package per.jgx.leetcode.topnterview150.easy;

/**
 * <a href="https://leetcode.cn/problems/number-of-1-bits/?envType=study-plan-v2&envId=top-interview-150">...</a>
 *
 * @author Jiang Guangxing
 */
public class HammingWeight {
    public static void main(String[] args) {

    }

    /**
     * 100111110
     */
    public static int hammingWeight(int n) {
        int ans = 0;
        String s = Integer.toBinaryString(n);
        for (char c : s.toCharArray()) {
            if (c == '1') {
                ans++;
            }
        }
        return ans;
    }
}

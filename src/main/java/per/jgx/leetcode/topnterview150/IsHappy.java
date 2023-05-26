package per.jgx.leetcode.topnterview150;

import java.util.HashSet;

/**
 * https://leetcode.cn/problems/happy-number/?envType=study-plan-v2&envId=top-interview-150
 *
 * @author Jiang Guangxing
 */
public class IsHappy {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
    }

    /**
     * 输入：n = 19
     * 输出：true
     * 解释：
     * 1^2 + 9^2 = 82
     * 8^2 + 2^2 = 68
     * 6^2 + 8^2 = 100
     * 1^2 + 0^2 + 0^2 = 1
     * <p>
     * 判断是否有环：快慢指针或者用一个集合记录
     */
    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (true) {
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
            n = getNext(n);
            if (n == 1) {
                return true;
            }
        }
    }

    /**
     * 快慢指针
     */
    public static boolean isHappy2(int n) {
        // fast是快指针 n是慢指针
        int fast = n;
        while (true) {
            fast = getNext(getNext(fast));
            n = getNext(n);
            if (fast == 1 || n == 1) {
                return true;
            }
            if (fast == n) {
                return false;
            }
        }
    }

    private static int getNext(int n) {
        int ans = 0;
        while (n > 0) {
            int m = n % 10;
            ans += m * m;
            n = n / 10;
        }
        return ans;
    }
}

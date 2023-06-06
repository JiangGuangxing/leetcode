package per.jgx.leetcode.topnterview150.easy;

import per.jgx.leetcode.Utils;

/**
 * <a href="https://leetcode.cn/problems/plus-one/?envType=study-plan-v2&envId=top-interview-150">...</a>
 *
 * @author Jiang Guangxing
 */
public class PlusOne {
    public static void main(String[] args) {
        int[] ans = plusOne(new int[]{1, 2, 3});
        Utils.printArr(ans);
    }

    public static int[] plusOne(int[] digits) {
        int c = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int d = digits[i];
            int sum = d + c;
            digits[i] = sum % 10;
            c = sum / 10;
        }
        if (c == 0) {
            return digits;
        }

        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }
}

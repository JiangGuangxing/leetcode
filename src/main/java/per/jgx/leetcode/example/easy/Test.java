package per.jgx.leetcode.example.easy;

/**
 * https://leetcode.cn/problems/check-if-number-has-equal-digit-count-and-digit-value/
 *
 * @author Jiang Guangxing
 */
public class Test {
    public static boolean digitCount(String num) {
        // 不超过10位
        int[] ints = new int[10];
        char[] chars = num.toCharArray();
        for (char c : chars) {
            ints[c - '0']++;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] - '0' != ints[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(digitCount("1210"));
    }
}


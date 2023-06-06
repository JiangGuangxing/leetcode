package per.jgx.leetcode.topnterview150.easy;

/**
 * <a href="https://leetcode.cn/problems/palindrome-number/">...</a>
 *
 * @author Jiang Guangxing
 */
public class isPalindromeInt {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    /**
     * 121
     */
    public static boolean isPalindrome(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        int i = 0, j = chars.length - 1;
        while (i <= j) {
            if (chars[i] != chars[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

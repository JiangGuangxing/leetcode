package per.jgx.leetcode.topnterview150.easy;

/**
 * @author Jiang Guangxing
 */
public class IsPalindrome {
    public static void main(String[] args) {
//        System.out.println((int) '_');
//        System.out.println((int) '9');
//        System.out.println((char) 58);
        System.out.println((int) 'A');
        System.out.println((int) 'Z');
        System.out.println((int) 'a');
        System.out.println((int) 'z');
//        System.out.println((char) ('a' - 32));
        System.out.println(isPalindrome("ab_a"));
    }

    /**
     * 输入: s = "1A man, a plan, a canal: Panama1"
     * 输出：true
     * 解释："amanaplanacanalpanama" 是回文串。
     */
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        String str = sb.toString();
        int i = 0, j = str.length() - 1;
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

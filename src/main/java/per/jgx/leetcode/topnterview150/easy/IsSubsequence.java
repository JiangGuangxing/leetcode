package per.jgx.leetcode.topnterview150.easy;

/**
 * @author Jiang Guangxing
 */
public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("aaaaaa", "aaaabb"));
        System.out.println(isSubsequence("abc", "abddc"));
    }

    /**
     * 输入：s = "abc", t = "tahbgdc"
     * 输出：true
     */
    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            char sc = s.charAt(i);
            char tc = t.charAt(j);
            if (sc == tc) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}

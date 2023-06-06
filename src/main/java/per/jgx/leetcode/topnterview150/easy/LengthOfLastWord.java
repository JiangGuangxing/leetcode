package per.jgx.leetcode.topnterview150.easy;

/**
 * @author Jiang Guangxing
 */
public class LengthOfLastWord {
    public static void main(String[] args) {

    }

    /**
     * 输入：s = "Hello World"
     * 输出：5
     * 解释：最后一个单词是“World”，长度为5。
     */
    public static int lengthOfLastWord(String s) {
        int ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                ans++;
            } else if (ans > 0) {
                break;
            }
        }
        return ans;
    }
}

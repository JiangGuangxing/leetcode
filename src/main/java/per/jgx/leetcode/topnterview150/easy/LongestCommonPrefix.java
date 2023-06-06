package per.jgx.leetcode.topnterview150.easy;

/**
 * https://leetcode.cn/problems/longest-common-prefix/?envType=study-plan-v2&envId=top-interview-150
 *
 * @author Jiang Guangxing
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    /**
     * 输入：strs = ["flower","flow","flight"]
     * 输出："fl"
     */
    public static String longestCommonPrefix(String[] arr) {
        String min = arr[0];
        for (String s : arr) {
            if (s.length() < min.length()) {
                min = s;
            }
        }
        StringBuilder ans = new StringBuilder();
        f:
        for (int i = 0; i < min.length(); i++) {
            char c = min.charAt(i);
            for (int j = 0; j < arr.length; j++) {
                if (c != arr[j].charAt(i)) {
                    break f;
                }
            }
            ans.append(c);
        }
        return ans.toString();
    }
}

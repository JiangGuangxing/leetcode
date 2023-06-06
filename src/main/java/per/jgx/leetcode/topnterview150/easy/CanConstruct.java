package per.jgx.leetcode.topnterview150.easy;

/**
 * https://leetcode.cn/problems/ransom-note/?envType=study-plan-v2&envId=top-interview-150
 *
 * @author Jiang Guangxing
 */
public class CanConstruct {
    public static void main(String[] args) {
        System.out.println((int) 'z');
        System.out.println(canConstruct("a", "b"));
        System.out.println(canConstruct("az", "abz"));
    }

    /**
     * 输入：ransomNote = "a", magazine = "b"
     * 输出：false
     */
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] counter = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            int c = magazine.charAt(i) - 'a';
            counter[c]++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            int c = ransomNote.charAt(i) - 'a';
            if (counter[c] == 0) {
                return false;
            } else {
                counter[c]--;
            }
        }
        return true;
    }

}

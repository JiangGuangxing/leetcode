package per.jgx.leetcode.topnterview150.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.cn/problems/word-pattern/?envType=study-plan-v2&envId=top-interview-150
 *
 * @author Jiang Guangxing
 */
public class WordPattern {
    public static void main(String[] args) {

    }

    /**
     * 输入: pattern = "abba", s = "dog cat cat dog"
     * 输出: true
     */
    public static boolean wordPattern(String pattern, String str) {
        String[] arr = str.split(" ");
        if (pattern.length() != arr.length) {
            return false;
        }
        Map<Character, String> m = new HashMap<>();
        Map<String, Character> m2 = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String s = arr[i];
            String mp = m.get(c);
            Character mp2 = m2.get(s);
            if ((mp != null && !mp.equals(s)) || (mp2 != null && mp2 != c)) {
                return false;
            }
            m.put(c, s);
            m2.put(s, c);
        }
        return true;
    }

}

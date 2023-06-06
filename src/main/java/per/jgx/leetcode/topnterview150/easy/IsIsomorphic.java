package per.jgx.leetcode.topnterview150.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Jiang Guangxing
 */
public class IsIsomorphic {
    public static void main(String[] args) {
        System.out.println((int) Character.MIN_VALUE);
        System.out.println((int) Character.MAX_VALUE);

        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("badc", "baba"));
        // egge addb
        // eggb adda
    }

    /**
     * 输入：s = "eggc", t = "adde"
     * 输出：true
     */
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> m = new HashMap<>();
        Map<Character, Character> m2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            Character mp = m.get(sc);
            Character mp2 = m2.get(tc);
            if ((mp != null && mp != tc) || (mp2 != null && mp2 != sc)) {
                return false;
            }
            m.put(sc, tc);
            m2.put(tc, sc);
        }
        return true;
    }
}

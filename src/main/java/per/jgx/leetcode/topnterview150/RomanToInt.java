package per.jgx.leetcode.topnterview150;

/**
 * https://leetcode.cn/problems/roman-to-integer/?envType=study-plan-v2&envId=top-interview-150
 *
 * @author Jiang Guangxing
 */
public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }

    /**
     * 输入: s = "III"
     * 输出: 3
     */
    public static int romanToInt(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'I' || c == 'X' || c == 'C') {
                if (i == s.length() - 1) {
                    if (c == 'I') {
                        ans += 1;
                    } else if (c == 'X') {
                        ans += 10;
                    } else {
                        ans += 100;
                    }
                } else {
                    char c2 = s.charAt(i + 1);
                    if (c == 'I') {
                        if (c2 == 'V') {
                            ans += 4;
                            i++;
                        } else if (c2 == 'X') {
                            ans += 9;
                            i++;
                        } else {
                            ans += 1;
                        }
                    } else if (c == 'X') {
                        if (c2 == 'L') {
                            ans += 40;
                            i++;
                        } else if (c2 == 'C') {
                            ans += 90;
                            i++;
                        } else {
                            ans += 10;
                        }
                    } else {
                        if (c2 == 'D') {
                            ans += 400;
                            i++;
                        } else if (c2 == 'M') {
                            ans += 900;
                            i++;
                        } else {
                            ans += 100;
                        }
                    }
                }
            } else {
                if (c == 'V') {
                    ans += 5;
                } else if (c == 'L') {
                    ans += 50;
                } else if (c == 'D') {
                    ans += 500;
                } else {
                    ans += 1000;
                }
            }
        }

        return ans;
    }
}

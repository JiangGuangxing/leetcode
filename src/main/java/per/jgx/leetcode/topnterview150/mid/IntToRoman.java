package per.jgx.leetcode.topnterview150.mid;

/**
 * <a href="https://leetcode.cn/problems/integer-to-roman/?envType=study-plan-v2&envId=top-interview-150">...</a>
 *
 * @author Jiang Guangxing
 */
public class IntToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(3));
        System.out.println(intToRoman(4));
        System.out.println(intToRoman(9));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1994));
    }

    /**
     * 输入: num = 3
     * 输出: "III"
     */
    public static String intToRoman(int num) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < num / 1000; i++) {
            ans.append("M");
        }
        int i = num % 1000;
        process(ans, i, 100);
        return ans.toString();
    }

    private static void process(StringBuilder ans, int i, int x) {
        if (x < 1) {
            return;
        }
        if (i >= 9 * x) {
            if (x == 100) {
                ans.append("CM");
            } else if (x == 10) {
                ans.append("XC");
            } else {
                ans.append("IX");
            }
            i -= 9 * x;
            process(ans, i, x / 10);
            // 减900之后只剩下两位数
        } else if (i >= 5 * x) {
            if (x == 100) {
                ans.append("D");
            } else if (x == 10) {
                ans.append("L");
            } else {
                ans.append("V");
            }
            i -= 5 * x;
            appendOne(ans, i, x);
            i = i % x;
            // 只剩下两位数
            process(ans, i, x / 10);
        } else if (i >= 4 * x) {
            if (x == 100) {
                ans.append("CD");
            } else if (x == 10) {
                ans.append("XL");
            } else {
                ans.append("IV");
            }
            i -= 4 * x;
            // 只剩下两位数
            process(ans, i, x / 10);
        } else {
            appendOne(ans, i, x);
            i = i % x;
            // 只剩下两位数
            process(ans, i, x / 10);
        }
    }

    private static void appendOne(StringBuilder ans, int i, int x) {
        for (int j = 0; j < i / x; j++) {
            if (x == 100) {
                ans.append("C");
            } else if (x == 10) {
                ans.append("X");
            } else {
                ans.append("I");
            }
        }
    }
}

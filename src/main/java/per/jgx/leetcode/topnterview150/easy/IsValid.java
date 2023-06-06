package per.jgx.leetcode.topnterview150.easy;

import java.util.Stack;

/**
 * <a href="https://leetcode.cn/problems/valid-parentheses/?envType=study-plan-v2&envId=top-interview-150">...</a>
 *
 * @author Jiang Guangxing
 */
public class IsValid {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            Character v = stack.pop();
            if ((c == ')' && v != '(') || (c == ']' && v != '[') || (c == '}' && v != '{')) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

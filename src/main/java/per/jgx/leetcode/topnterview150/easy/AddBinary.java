package per.jgx.leetcode.topnterview150.easy;

/**
 * <a href="https://leetcode.cn/problems/add-binary/?envType=study-plan-v2&envId=top-interview-150">...</a>
 *
 * @author Jiang Guangxing
 */
public class AddBinary {
    // 110010
    //    100
    //    110
    public static void main(String[] args) {
        System.out.println(addBinary("100", "110010"));
    }

    public static String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, c = 0;
        while (i >= 0 || j >= 0 || c != 0) {
            int A = i >= 0 ? a.charAt(i) - '0' : 0;
            int B = j >= 0 ? b.charAt(j) - '0' : 0;
            int sum = A + B + c;
            c = sum / 2;
            ans.append(sum % 2);
            i--;
            j--;
        }
        return ans.reverse().toString();
    }
}

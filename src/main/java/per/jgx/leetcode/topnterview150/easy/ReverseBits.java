package per.jgx.leetcode.topnterview150.easy;

/**
 * <a href="https://leetcode.cn/problems/reverse-bits/?envType=study-plan-v2&envId=top-interview-150">...</a>
 *
 * @author Jiang Guangxing
 */
public class ReverseBits {
    public static void main(String[] args) {
//        System.out.println(reverseBits(43261596));
        System.out.println((int)Long.parseLong("10111111111111111111111111111111",2));
    }

    public static int reverseBits(int n) {
        String s = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(s).reverse();
        if (s.length() < 32) {
            for (int i = 0; i < 32 - s.length(); i++) {
                sb.append(0);
            }
        }
        return Integer.parseUnsignedInt(sb.toString(), 2);
    }
}

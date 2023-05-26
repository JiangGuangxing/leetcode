package per.jgx.leetcode.topnterview150;

/**
 * 贪心
 * https://leetcode.cn/problems/gas-station/
 *
 * @author Jiang Guangxing
 */
public class CanCompleteCircuit {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i++) {
            if (process(gas, cost, i)) {
                return i;
            }
        }
        return 0;
    }

    private static boolean process(int[] gas, int[] cost, int i) {
        return false;
    }

    public static void main(String[] args) {

    }
}

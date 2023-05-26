package per.jgx.leetcode.topnterview150;

/**
 * https://leetcode.cn/problems/candy/?envType=study-plan-v2&envId=top-interview-150
 *
 * @author Jiang Guangxing
 */
public class Candy {
    public static void main(String[] args) {

    }

    /**
     * 输入：ratings = [1,0,2]
     * 输出：5
     * 解释：你可以分别给第一个、第二个、第三个孩子分发 2、1、2 颗糖果。
     */
    public static int candy(int[] ratings) {
        return process(ratings, 0, ratings.length - 1);
    }

    private static int process(int[] ratings, int i, int j) {
        if (i + 1 == j) {
            return 1;
        }

        return 0;
    }

}

package per.jgx.leetcode.topnterview150;

import java.util.Arrays;

/**
 * https://leetcode.cn/problems/h-index/?envType=study-plan-v2&envId=top-interview-150
 *
 * @author Jiang Guangxing
 */
public class HIndex {
    public static void main(String[] args) {
        System.out.println(hIndex(new int[]{1, 3, 1}));
        System.out.println(hIndex(new int[]{3, 0, 6, 1, 5}));
    }

    /**
     * 输入：citations = [3,0,6,1,5]
     * 输出：3
     * 解释：给定数组表示研究者总共有 5 篇论文，每篇论文相应的被引用了 3, 0, 6, 1, 5 次。
     * 由于研究者有 3 篇论文每篇 至少 被引用了 3 次，其余两篇论文每篇被引用 不多于 3 次，所以她的 h 指数是 3。
     */
    // 0 1 3 5 6
    // 11 15
    public static int hIndex(int[] citations) {
        // 从小到大排序
        Arrays.sort(citations);
        // 从大到小遍历，找到citations[i]不大于h的位置
        for (int i = citations.length - 1; i >= 0; i--) {
            if (citations[i] < citations.length - i) {
                return citations.length - i - 1;
            }
        }
        // 从头走到尾了，说明都符合citations[i]>=h
        return citations.length;
    }
}

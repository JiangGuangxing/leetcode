package per.jgx.leetcode.topnterview150.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/summary-ranges/?envType=study-plan-v2&envId=top-interview-150">...</a>
 *
 * @author Jiang Guangxing
 */
public class SummaryRanges {
    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0, 1, 2, 4, 5, 6}));
    }

    /**
     * 输入：nums = [0,1,2,4,5,7]
     * 输出：["0->2","4->5","7"]
     * 解释：区间范围是：
     * [0,2] --> "0->2"
     * [4,5] --> "4->5"
     * [7,7] --> "7"
     */
    public static List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int begin = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (i == nums.length - 1 || num + 1 != nums[i + 1]) {
                // 使用StringBuilder连接字符串，比用+更快
                StringBuilder sb = new StringBuilder();
                ans.add((i == begin ? sb.append(num) : sb.append(nums[begin]).append("->").append(num)).toString());
                begin = i + 1;
            }
        }
        return ans;
    }
}

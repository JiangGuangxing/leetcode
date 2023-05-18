package per.jgx.leetcode.example.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.cn/problems/two-sum/
 *
 * @author Jiang Guangxing
 */
public class Test2 {
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> m = new HashMap<>();
        m.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            if (m.containsKey(target - nums[i])) {
                ans[0] = m.get(target - nums[i]);
                ans[1] = i;
                break;
            }
            m.put(nums[i], i);
        }
        return ans;
    }
}

package per.jgx.leetcode.topnterview150.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.cn/problems/contains-duplicate-ii/?envType=study-plan-v2&envId=top-interview-150">...</a>
 *
 * @author Jiang Guangxing
 */
public class ContainsNearbyDuplicate {
    public static void main(String[] args) {

    }

    /**
     * 输入：nums = [1,2,3,1], k = 3
     * 输出：true
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer index = map.get(nums[i]);
            if (index != null && i - index <= k) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}

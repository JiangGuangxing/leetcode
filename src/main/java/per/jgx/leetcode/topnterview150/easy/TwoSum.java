package per.jgx.leetcode.topnterview150.easy;

import per.jgx.leetcode.Utils;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.cn/problems/two-sum/?envType=study-plan-v2&envId=top-interview-150
 *
 * @author Jiang Guangxing
 */
public class TwoSum {
    public static void main(String[] args) {
        Utils.printArr(twoSum(new int[]{2, 7, 11, 15}, 9));
        System.out.println();
        Utils.printArr(twoSum(new int[]{3,2,4}, 6));
    }

    /**
     * 输入：nums = [2,7,11,15], target = 9
     * 输出：[0,1]
     * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
     * <p>
     * 输入：nums = [2,4,7,8,15], target = 9
     * 输出：[0,2]
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer v = map.get(target - nums[i]);
            if (v != null) {
                return new int[]{i, v};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }

}

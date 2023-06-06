package per.jgx.leetcode.topnterview150.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.cn/problems/majority-element/?envType=study-plan-v2&envId=top-interview-150
 *
 * @author Jiang Guangxing
 */
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int c = nums.length / 2;
        for (int n : nums) {
            Integer count = countMap.merge(n, 1, Integer::sum);
            if (count > c) {
                return n;
            }
        }
        return -1;
    }

    public static int majorityElement2(int[] nums) {
        // 排序之后取中间值即可，N*logN，使用hash虽然是O(N)，但是Hash的常数时间很大
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public static void main(String[] args) {

    }
}

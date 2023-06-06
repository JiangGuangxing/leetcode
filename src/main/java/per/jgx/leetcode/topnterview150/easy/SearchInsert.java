package per.jgx.leetcode.topnterview150.easy;

/**
 * <a href="https://leetcode.cn/problems/search-insert-position/?envType=study-plan-v2&envId=top-interview-150">...</a>
 *
 * @author Jiang Guangxing
 */
public class SearchInsert {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));
    }

    /**
     * 1 2 3 4 5 6 7 8
     * 二分查找
     */
    public static int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1, ans = nums.length;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (target <= nums[m]) {
                r = m - 1;
                ans = m;
            } else {
                l = m + 1;
            }
        }
        return ans;
    }
}

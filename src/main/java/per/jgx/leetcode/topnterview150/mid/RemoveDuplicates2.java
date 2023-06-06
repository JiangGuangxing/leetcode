package per.jgx.leetcode.topnterview150.mid;

/**
 * <a href="https://leetcode.cn/problems/remove-duplicates-from-sorted-array-ii/?envType=study-plan-v2&envId=top-interview-150">...</a>
 *
 * @author Jiang Guangxing
 */
public class RemoveDuplicates2 {
    public int removeDuplicates(int[] nums) {
        int ans = 0;
        for (int n : nums) {
            if (ans < 2 || nums[ans - 2] != n) {
                nums[ans++] = n;
            }
        }
        return ans;
    }
}

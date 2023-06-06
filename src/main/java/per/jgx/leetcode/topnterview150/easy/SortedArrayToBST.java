package per.jgx.leetcode.topnterview150.easy;

import per.jgx.leetcode.TreeNode;

/**
 * 将有序数组转换为二叉搜索树
 * <a href="https://leetcode.cn/problems/convert-sorted-array-to-binary-search-tree/?envType=study-plan-v2&envId=top-interview-150">...</a>
 *
 * @author Jiang Guangxing
 */
public class SortedArrayToBST {
    public static void main(String[] args) {

    }

    /**
     * 要求平衡，所以选择中间的数作为根节点
     */
    public static TreeNode sortedArrayToBST(int[] nums) {
        return process(nums, 0, nums.length - 1);
    }

    public static TreeNode process(int[] nums, int l, int r) {
        if (l > r) {
            return null;
        }
        int m = (l + r) / 2;
        TreeNode n = new TreeNode(nums[m]);
        n.left = process(nums, l, m - 1);
        n.right = process(nums, m + 1, r);
        return n;
    }
}

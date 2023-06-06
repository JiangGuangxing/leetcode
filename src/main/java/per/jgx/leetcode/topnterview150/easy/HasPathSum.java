package per.jgx.leetcode.topnterview150.easy;

import per.jgx.leetcode.TreeNode;

/**
 * <a href="https://leetcode.cn/problems/path-sum/?envType=study-plan-v2&envId=top-interview-150">...</a>
 *
 * @author Jiang Guangxing
 */
public class HasPathSum {
    public static void main(String[] args) {
        TreeNode t = new TreeNode(5);
        t.left = new TreeNode(4);
        t.left.left = new TreeNode(11);
        t.left.left.left = new TreeNode(7);
        t.left.left.right = new TreeNode(2);
        t.right = new TreeNode(80);
        t.right.left = new TreeNode(13);
        t.right.right = new TreeNode(4);
        t.right.right.right = new TreeNode(1);
        System.out.println(hasPathSum(null, 22));
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

}

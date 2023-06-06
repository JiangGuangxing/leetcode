package per.jgx.leetcode.topnterview150.easy;

import per.jgx.leetcode.TreeNode;

/**
 * <a href="https://leetcode.cn/problems/symmetric-tree/?envType=study-plan-v2&envId=top-interview-150">...</a>
 *
 * @author Jiang Guangxing
 */
public class IsSymmetric {
    public static boolean isSymmetric(TreeNode root) {
        return process(root, root);
    }

    private static boolean process(TreeNode p, TreeNode q) {
        // 一个为空，一个不为空
        if (p == null ^ q == null) {
            return false;
        }
        // 都为空
        if (p == null) {
            return true;
        }
        // 都不为空
        return p.val == q.val && process(p.left, q.right) && process(p.right, q.left);
    }

    public static void main(String[] args) {
        TreeNode n = new TreeNode(7);
        n.left = new TreeNode(-64);
        n.right = new TreeNode(-64);
        n.left.left = new TreeNode(-6);
        n.left.right = new TreeNode(-90);
        n.right.left = new TreeNode(-90);
        n.right.right = new TreeNode(-6);

        n.left.left.left = new TreeNode(88);
        n.left.left.right = new TreeNode(-44);

        n.left.right.left = new TreeNode(68);
        n.left.right.right = new TreeNode(-65);

        n.right.left.left = new TreeNode(-76);
        n.right.left.right = new TreeNode(68);

        n.right.right.left = new TreeNode(-44);
        n.right.right.right = new TreeNode(88);

        System.out.println(isSymmetric(n));
    }
}

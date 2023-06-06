package per.jgx.leetcode.topnterview150.easy;

import per.jgx.leetcode.TreeNode;

/**
 * <a href="https://leetcode.cn/problems/same-tree/?envType=study-plan-v2&envId=top-interview-150">...</a>
 *
 * @author Jiang Guangxing
 */
public class IsSameTree {
    public static void main(String[] args) {

    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        // p和q都是空 或者 p和q都不是空而且他们的val相等
        return (p == null && q == null) || (p != null && q != null && p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

package per.jgx.leetcode.topnterview150.easy;

import per.jgx.leetcode.TreeNode;

/**
 * <a href="https://leetcode.cn/problems/invert-binary-tree/?envType=study-plan-v2&envId=top-interview-150">...</a>
 *
 * @author Jiang Guangxing
 */
public class InvertTree {
    public static void main(String[] args) {
        TreeNode r = new TreeNode(4);
        r.left = new TreeNode(2);
        r.right = new TreeNode(7);
        r.left.left = new TreeNode(1);
        r.left.right = new TreeNode(3);
        r.right.left = new TreeNode(6);
        r.right.right = new TreeNode(9);
        TreeNode.print(r, 1);
        TreeNode.print(invertTree(r), 1);

        TreeNode.print(new TreeNode(), 1);
        TreeNode.print(invertTree(new TreeNode()), 1);
    }

    /**
     * 4 2 1 3 7 6 9
     * 4 7 9 6 2 3 1
     */
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        // 交换过程中，先保存一个，与数组元素互换类似
        TreeNode right = invertTree(root.right);
        root.right = invertTree(root.left);
        root.left = right;
        return root;
    }
}

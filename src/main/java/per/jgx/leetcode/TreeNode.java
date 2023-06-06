package per.jgx.leetcode;

/**
 * @author Jiang Guangxing
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void print(TreeNode t, int sort) {
        process(t, sort);
        System.out.println();
    }

    private static void process(TreeNode t, int sort) {
        if (t == null) {
            return;
        }
        if (sort == 1) {
            System.out.print(t.val + " ");
        }
        process(t.left, sort);
        if (sort == 2) {
            System.out.print(t.val + " ");
        }
        process(t.right, sort);
        if (sort == 3) {
            System.out.print(t.val + " ");
        }
    }
}

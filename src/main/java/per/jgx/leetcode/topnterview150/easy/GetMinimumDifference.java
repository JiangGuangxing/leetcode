package per.jgx.leetcode.topnterview150.easy;

import per.jgx.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/minimum-absolute-difference-in-bst/?envType=study-plan-v2&envId=top-interview-150">...</a>
 *
 * @author Jiang Guangxing
 */
public class GetMinimumDifference {
    public static void main(String[] args) {

    }

    /**
     * 给的是二叉搜索树：左节点小于右节点，中序遍历就是从小到大遍历
     *
     * @param root
     * @return
     */
    public static int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        process(root, list);
        int ans = Math.abs(list.get(0) - list.get(1));
        for (int i = 1; i < list.size() - 1; i++) {
            ans = Math.min(Math.abs(list.get(i) - list.get(i + 1)), ans);
        }
        return ans;
    }

    private static void process(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        process(root.left, list);
        list.add(root.val);
        process(root.right, list);
    }
}

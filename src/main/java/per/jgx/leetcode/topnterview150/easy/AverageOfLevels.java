package per.jgx.leetcode.topnterview150.easy;

import per.jgx.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <a href="https://leetcode.cn/problems/average-of-levels-in-binary-tree/?envType=study-plan-v2&envId=top-interview-150">...</a>
 *
 * @author Jiang Guangxing
 */
public class AverageOfLevels {

    public static void main(String[] args) {
        TreeNode t = new TreeNode(3);
        t.left = new TreeNode(9);
        t.right = new TreeNode(20);
        t.right.left = new TreeNode(15);
        t.right.right = new TreeNode(7);
        System.out.println(averageOfLevels(t));
    }

    /**
     * 宽度优先遍历（BFS）、按层遍历
     */
    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            double sum = 0;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode h = q.poll();
                sum += h.val;
                if (h.left != null) {
                    q.offer(h.left);
                }
                if (h.right != null) {
                    q.offer(h.right);
                }
            }
            ans.add(sum / size);
        }
        return ans;
    }
}

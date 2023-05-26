package per.jgx.leetcode.digui;

/**
 * Master公式：分析递归方法时间复杂度
 *
 * 使用递归求数组最大值
 *
 * @author Jiang Guangxing
 */
public class MaxValue {
    public static void main(String[] args) {
        System.out.println(max(new int[]{2, 44, 545, 121, 6, 112, 3}));
    }

    // 对于7个元素的数组，递归图为
    //          f(0,6)
    //       f(0,3),f(4,6)
    //    f(0,1),f(2,3),f(4,5),f(6,6)
    // f(0,0),f(1,1),f(2,2),f(3,3),f(4,4),f(5,5)
    public static int max(int[] arr) {
        return max(arr, 0, arr.length - 1);
    }

    // 求数组arr[l..r]最大值
    public static int max(int[] arr, int l, int r) {
        // 打印函数参数，方便查看调用顺序
        System.out.println(l + "---" + r);
        //base case
        if (l == r) {
            return arr[l];
        }
        // 将数组平均分成两份，求左边最大值，然后求右边最大值，最终取两个最大值的最大值
        // 为什么要分成两份：因为分成两份之后可以直接算出两个值的最大值，
        // 其实也可以分成三份、四份、任意份，然后算出这些份中的最大值，只是分成多份不好确定每份范围
        int mid = (l + r) / 2;
        return Math.max(max(arr, l, mid), max(arr, mid + 1, r));
    }
}

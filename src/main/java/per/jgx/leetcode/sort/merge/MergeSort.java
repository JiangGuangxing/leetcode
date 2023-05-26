package per.jgx.leetcode.sort.merge;

import per.jgx.leetcode.Utils;

/**
 * 归并排序
 * O(N*logN)
 * 需要辅助数组
 *
 * @author Jiang Guangxing
 */
public class MergeSort {
    // 6 1 3 7 2 8
    public static void main(String[] args) {
        int[] arr = {76, 44, 898, 11, 234, 66, 2, 95};
        sort(arr);
        Utils.printArr(arr);
    }

    public static void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int l, int r) {
        if (l == r) {
            return;
        }
        int mid = (l + r) / 2;
        // 左边先有序
        sort(arr, l, mid);
        // 右边有序
        sort(arr, mid + 1, r);
        // merge，整体有序
        merge(arr, l, mid, r);
    }

    // 数组左边有序，右边有序，使整体有序
    // 1 4 5,2 3 9
    // 1 2 3 4 5 9
    private static void merge(int[] arr, int l, int mid, int r) {
        int[] tmp = new int[r - l + 1];
        int i = 0;
        int li = l;
        int ri = mid + 1;
        while (li <= mid && ri <= r) {
            tmp[i++] = arr[ri] < arr[li] ? arr[ri++] : arr[li++];
        }
        // 下面两个while只有一个会执行，因为肯定有一边会处理完
        while (li <= mid) {
            tmp[i++] = arr[li++];
        }
        while (ri <= r) {
            tmp[i++] = arr[ri++];
        }
        System.arraycopy(tmp, 0, arr, l, tmp.length);
//        for (int j = 0; j < tmp.length; j++) {
//            arr[l + j] = tmp[j];
//        }
    }


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tmp = new int[m + n];
        int it = 0, i1 = 0, i2 = 0;
        while (i1 < m && i2 < n) {
            tmp[it++] = nums1[i1] < nums2[i2] ? nums1[i1++] : nums2[i2++];
        }
        while (i1 < m) {
            tmp[it++] = nums1[i1++];
        }
        while (i2 < n) {
            tmp[it++] = nums2[i2++];
        }
        System.arraycopy(tmp, 0, nums1, 0, m + n);
    }
}

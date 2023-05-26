package per.jgx.leetcode.sort.heap;

import per.jgx.leetcode.Utils;

import java.util.PriorityQueue;

/**
 * 堆排序
 *
 * @author Jiang Guangxing
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 2, 7, 13, 3};
        heapSort(arr);
        Utils.printArr(arr);
    }

    public static void heapSort(int[] arr) {
        PriorityQueue<Integer> q = new PriorityQueue<>(arr.length);
        //N*logN
        for (int a : arr) {
            q.add(a);//logN
        }
        int i = 0;
        //N*logN
        while (!q.isEmpty()) {
            arr[i++] = q.poll();//logN
        }
        //整体N*logN，使用了额外的空间
    }
}

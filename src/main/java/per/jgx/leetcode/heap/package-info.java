/**
 * 堆：是一个完全二叉树，每个子树的最大值都是头结点，优先级队列
 * 完全二叉树：除了最后一层可以不满，其他层必须满，而且最后一层要求从左到右一层满
 * 数组实现完全二叉树：
 * 左：2*i+1
 * 右：2*i+2
 * 父：(i-1)/2
 *
 *      0
 *    1   2
 *  3  4  5  6
 *  如果某个位置的值放生变化，只要对这个位置分别调一次heapify和heapinsert即可
 *  时间复杂度：O(logN)，因为二叉树高度是LogN
 *
 * @author Jiang Guangxing
 */
package per.jgx.leetcode.heap;
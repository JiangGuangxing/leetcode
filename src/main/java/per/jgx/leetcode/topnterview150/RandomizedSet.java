package per.jgx.leetcode.topnterview150;

import java.util.*;

/**
 * https://leetcode.cn/problems/insert-delete-getrandom-o1/?envType=study-plan-v2&envId=top-interview-150
 *
 * @author Jiang Guangxing
 */
public class RandomizedSet {
    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        System.out.println(randomizedSet.insert(0)); // 向集合中插入 1 。返回 true 表示 1 被成功地插入。
        System.out.println(randomizedSet.remove(0)); // 返回 false ，表示集合中不存在 2 。
        System.out.println(randomizedSet.insert(-1)); // 向集合中插入 2 。返回 true 。集合现在包含 [1,2] 。
        System.out.println(randomizedSet.remove(0)); // 向集合中插入 2 。返回 true 。集合现在包含 [1,2] 。
        System.out.println(randomizedSet.getRandom()); // getRandom 应随机返回 1 或 2 。
        System.out.println(randomizedSet.getRandom()); // getRandom 应随机返回 1 或 2 。
        System.out.println(randomizedSet.getRandom()); // getRandom 应随机返回 1 或 2 。
        System.out.println(randomizedSet.getRandom()); // getRandom 应随机返回 1 或 2 。
        System.out.println(randomizedSet.getRandom()); // getRandom 应随机返回 1 或 2 。
        System.out.println(randomizedSet.getRandom()); // getRandom 应随机返回 1 或 2 。
        System.out.println(randomizedSet.getRandom()); // getRandom 应随机返回 1 或 2 。
        System.out.println(randomizedSet.getRandom()); // getRandom 应随机返回 1 或 2 。
    }

    private final Map<Integer, Integer> m;
    private final List<Integer> list;
    private final Random random;

    public RandomizedSet() {
        m = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (m.containsKey(val)) {
            return false;
        }
        list.add(val);
        m.put(val, m.size());
        return true;
    }

    public boolean remove(int val) {
        if (!m.containsKey(val)) {
            return false;
        }
        Integer v = m.remove(val);
        list.remove(v);
        return true;
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}

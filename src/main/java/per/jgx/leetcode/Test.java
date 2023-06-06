package per.jgx.leetcode;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Jiang Guangxing
 */
public class Test {
    private static volatile boolean f;
    private static AtomicInteger i;

    static {
        i = new AtomicInteger(0);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int j = 1; j <= 9; j += 2) {
                while (true) {
                    if (!f) {
                        System.out.println("t1:" + j);
                        f = true;
                        break;
                    }
                }
            }
        });
        thread.start();

        for (int j = 2; j <= 10; j += 2) {
            while (true) {
                if (f) {
                    System.out.println("t2:" + j);
                    f = false;
                    break;
                }
            }
        }
        thread.join();
    }
}

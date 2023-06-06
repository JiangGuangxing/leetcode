package per.jgx.leetcode.limiter;

import com.google.common.util.concurrent.RateLimiter;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Jiang Guangxing
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        RateLimiter limiter = RateLimiter.create(10);

        Thread.sleep(1000);

        ExecutorService service = Executors.newFixedThreadPool(16);
        long begin = System.currentTimeMillis();
        int c = 160;
        int s = 25;
        for (int i = 0; i < c; i++) {
            Thread.sleep(s);
            if (System.currentTimeMillis() - begin > c * s) {
                break;
            }
            service.execute(() -> {
                if (limiter.tryAcquire()) {
                    System.out.println(LocalDateTime.now() + "----pass");
                } else {
                    System.out.println(LocalDateTime.now() + "----fail");
                }
            });
        }
        service.shutdown();
    }

}

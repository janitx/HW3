package utils;

import java.util.concurrent.TimeUnit;

public class WaitHelper {
    public static void delay() {
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            System.err.printf("InterruptedException %s %n", e.getMessage());
        }
    }
}

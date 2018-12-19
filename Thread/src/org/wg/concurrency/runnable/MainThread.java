package org.wg.concurrency.runnable;

import org.wg.LiftOff;

public class MainThread {
    public static void main(String[] args) {
        LiftOff launch = new LiftOff();
        // 不会产生线程行为，要想实现线程
        launch.run();
    }
} /*
 * Output: #0(9), #0(8), #0(7), #0(6), #0(5), #0(4), #0(3), #0(2), #0(1),
 * #0(Liftoff!),
 */// :~

package org.wg.concurrency.safe;//: concurrency/IntGenerator.java

/**
 * 共享资源
 */
public abstract class IntGenerator {
    private volatile boolean canceled = false;

    public abstract int next();

    // Allow this to be canceled:
    public void cancel() {
        canceled = true;
    }

    public boolean isCanceled() {
        return canceled;
    }
} ///:~

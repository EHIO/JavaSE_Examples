package org.wg.concurrency.safe;//: concurrency/EvenGenerator.java
// When threads collide.

import static net.mindview.util.Print.print;

/**
 * 演示不正确的访问共享资源
 */
public class EvenGenerator extends IntGenerator {
    private int currentEvenValue = 0;

    public int next() {
        ++currentEvenValue; // Danger point here!
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());
    }
} /* Output: (Sample)
Press Control-C to exit
89476993 not even!
89476993 not even!
*///:~

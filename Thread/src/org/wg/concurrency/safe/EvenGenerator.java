package org.wg.concurrency.safe;//: concurrency/EvenGenerator.java
// When threads collide.

import static net.mindview.util.Print.print;

public class EvenGenerator extends IntGenerator {
    private int currentEvenValue = 0;

    public int next() {
        System.out.println(Thread.currentThread().getName() + "..." + currentEvenValue);
        ++currentEvenValue; // Danger point here!
//        System.out.println(Thread.currentThread().getName() + "..." + currentEvenValue);
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

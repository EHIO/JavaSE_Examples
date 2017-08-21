package org.wg.classloading.example_01;

/**
 * Created by run on 2017/8/21.
 */
public class SubClass extends SuperClass {

    static {
        System.out.println("SubClass init!");
    }
}

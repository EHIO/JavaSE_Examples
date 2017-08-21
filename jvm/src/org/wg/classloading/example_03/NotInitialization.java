package org.wg.classloading.example_03;

import org.wg.classloading.example_01.SubClass;

/**
 * Created by run on 2017/8/21.
 */
public class NotInitialization {

    public static void main(String[] args) {
        System.out.println(ConstClass.HELLOWORLD);
    }
}

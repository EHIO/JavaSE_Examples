package org.wg.classloading.example_03;

/**
 * 被动使用类字段
 * 常量在编译阶段会存入调用类的常量池中， 本质上并没有直接引用到定义常量的类，
 * 因此不会触发定义常量的类的初始化
 */
public class ConstClass {
    // 编译阶段，常量通过常量传播优化会存储到NotInitialization类的常量池中
    public static final String HELLOWORLD = "hello world";

    static {
        System.out.println("ConstClass init!");
    }
}

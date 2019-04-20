package org.wg.io.file.digui;

/**
 * 递归：
 * 函数自身直接或者间接的调用到了自身。
 * <p>
 * 一个功能在被重复使用，并每次使用时，参与运算的结果和上一次调用有关。
 * 这时可以用递归来解决问题。
 * <p>
 * <p>
 * 注意：
 * 1，递归一定明确条件。否则容易栈溢出。
 * 2，注意一下递归的次数。
 */
public class DiGuiDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("getSum(): " + getSum(100));
        System.out.println("jieCheng(): " + jieCheng(5));
    }

    /**
     * 求和递归
     *
     * @param num
     * @return
     */
    public static int getSum(int num) {
        if (num == 1) {
            return 1;
        }
        return num + getSum(num - 1);
    }

    /**
     * 阶乘递归
     *
     * @param n
     * @return
     */
    public static int jieCheng(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * jieCheng(n - 1);
        }
    }
}

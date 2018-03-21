package org.wg.exception;

/**
 * 虚拟机栈和本地方法栈溢出异常测试
 * VM args : -Xss128k
 * 减少栈的内容为128k
 *
 * @author run
 */
public class JavaVMStackSOP {

    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        JavaVMStackSOP oom = new JavaVMStackSOP();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length : " + oom.stackLength);
            throw e;
        }
    }
}

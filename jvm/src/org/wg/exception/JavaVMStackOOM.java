package org.wg.exception;

/**
 * 创建多线程导致内存溢出测试
 * VM args : -Xss2M
 *  @author rum
 */
public class JavaVMStackOOM {


    public void dontStop() {
        while (true) {

        }
    }

    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) {
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
    }
}

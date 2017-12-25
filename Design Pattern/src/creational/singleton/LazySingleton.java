package creational.singleton;

/**
 * 懒汉式
 * 类加载进来，没有对象，只有调用了getInstance方法时，才会创建对象。
 * 延迟加载形式。
 *
 * @author wg
 */
public class LazySingleton {

    private static LazySingleton uniqueInstance;

    private LazySingleton() {
    }

    /*
    // version 1 : 线程不安全
    public static LazySingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LazySingleton();
        }
        return uniqueInstance;
    }
    */

    /*
    // version 2 : 效率还可以更高
    public synchronized static LazySingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LazySingleton();
        }
        return uniqueInstance;
    }
    */


    /**
     * 加入双重判断可以解决效率问题
     * @return
     */
    public static LazySingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized(LazySingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new LazySingleton();
                }
            }
        }
        return uniqueInstance;
    }
}
package creational.singleton;

/**
 * 饿汉式
 *
 * @author wg
 */
public class HungrySingleton {

    private static HungrySingleton uniqueInstance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {

        return uniqueInstance;
    }
}

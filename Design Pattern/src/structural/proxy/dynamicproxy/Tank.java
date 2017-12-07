package structural.proxy.dynamicproxy;

import java.util.Random;

/**
 * 坦克
 */
public class Tank implements Moveable {

    @Override
    public void move() {

        System.out.println("Tank Moving...");
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

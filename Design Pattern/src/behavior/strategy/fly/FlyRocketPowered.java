package behavior.strategy.fly;

/**
 * 利用火箭动力的飞行行为
 *
 * @author wg
 */
public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("我加了火箭飞行动力");
    }

}

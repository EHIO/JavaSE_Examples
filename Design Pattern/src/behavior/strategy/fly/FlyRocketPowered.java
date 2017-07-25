package behavior.strategy.fly;

/**
 * 利用火箭动力的飞行行为
 * @ClassName: FlyRocketPowered 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author A18ccms a18ccms_gmail_com 
 * @date 2015-12-26 下午6:43:41
 */
public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("最新技术， 加入火箭推力");
	}

}

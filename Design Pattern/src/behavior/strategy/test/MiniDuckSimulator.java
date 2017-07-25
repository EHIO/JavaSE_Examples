package behavior.strategy.test;

import behavior.strategy.Duck;
import behavior.strategy.MarrardDuck;
import behavior.strategy.ModelDuck;
import behavior.strategy.fly.FlyRocketPowered;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MarrardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		System.out.println("---------------------");
		//��̬�ĸı���Ϊ
		Duck modelDuck = new ModelDuck();
		modelDuck.display();
		modelDuck.performFly();
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		modelDuck.performFly();
	}
}

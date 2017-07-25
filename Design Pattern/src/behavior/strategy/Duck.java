package behavior.strategy;

import behavior.strategy.fly.FlyBehavior;
import behavior.strategy.quack.QuackBehavior;

/**
 * 鸭子类
 * @author Administrator
 *
 */
public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
		
	}
	
	public abstract void display();
	
	/**
	 * 执行飞的方法
	 * <p>Title: </p> 
	 * <p>Description: </p>
	 */
	public void performFly() {
		flyBehavior.fly();
	}
	/**
	 * 执行叫的方法
	 * <p>Title: </p> 
	 * <p>Description: </p>
	 */
	public void performQuack() {
		//鸭子对象不亲自处理叫的行为，而是委托给quackBehavior引用的对象
		quackBehavior.quack();
	}
	
	/**
	 * 游泳方法
	 * <p>Title: </p> 
	 * <p>Description: </p>
	 */
	public void swim() {
		
	}
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}


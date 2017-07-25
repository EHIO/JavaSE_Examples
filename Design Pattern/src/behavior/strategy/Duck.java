package behavior.strategy;

import behavior.strategy.fly.FlyBehavior;
import behavior.strategy.quack.QuackBehavior;

/**
 * Ѽ����
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
	 * ִ�зɵķ���
	 * <p>Title: </p> 
	 * <p>Description: </p>
	 */
	public void performFly() {
		flyBehavior.fly();
	}
	/**
	 * ִ�неķ���
	 * <p>Title: </p> 
	 * <p>Description: </p>
	 */
	public void performQuack() {
		//Ѽ�Ӷ������Դ���е���Ϊ������ί�и�quackBehavior���õĶ���
		quackBehavior.quack();
	}
	
	/**
	 * ��Ӿ����
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


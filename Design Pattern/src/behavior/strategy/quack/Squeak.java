package behavior.strategy.quack;
/**
 * ���ǽ���Ϊ��ʵ�֣���֨֨�е�Ѽ����
 * @author Administrator
 *
 */
public class Squeak implements QuackBehavior {

	/**
	 * ʵ��֨֨�е�Ѽ����Ϊ
	 */
	@Override
	public void quack() {
		System.out.println("֨֨��");
	}

}

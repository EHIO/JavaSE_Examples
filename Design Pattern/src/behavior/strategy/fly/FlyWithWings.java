package behavior.strategy.fly;

/**
 * ���Ƿ�����Ϊ��ʵ�֣��������ɵ�Ѽ���á�
 * @author Administrator
 *
 */
public class FlyWithWings implements FlyBehavior {

	/**
	 * ʵ�ֻ�ɵ�Ѽ�ӵķ�����Ϊ
	 */
	@Override
	public void fly() {
		System.err.println("�һ��");
	}

}

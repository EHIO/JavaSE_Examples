package behavior.strategy.fly;
/**
 * ���Ƿ�����Ϊ��ʵ�֣���������ɵ�Ѽ���á�
 * @author Administrator
 *
 */
public class FlyNotWay implements FlyBehavior {

	/**
	 * ʵ�����в���ɵ�Ѽ�ӵķ��ж���
	 */
	@Override
	public void fly() {
		System.out.println("�Ҳ����");
	}

}

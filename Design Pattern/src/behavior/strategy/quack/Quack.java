package behavior.strategy.quack;
/**
 * ���ǽ���Ϊ��ʵ�֣��������е�Ѽ����
 * @author Administrator
 *
 */
public class Quack implements QuackBehavior {

	/**
	 * ʵ�ֹ����е�Ѽ����Ϊ
	 */
	@Override
	public void quack() {
		System.err.println("������");
	}

}

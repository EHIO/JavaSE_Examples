package structural.adapter.example_one;

/**
 * ��ͷѼ
 */
public class MallardDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("�¸½�");
	}

	@Override
	public void fly() {
		System.out.println("���ڷ�");
	}

}

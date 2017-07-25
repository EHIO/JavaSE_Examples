package structural.adapter.example_one;

public class DuckTestDrive {
	public static void main(String[] args) {
		// ����һ��Ѽ��
		MallardDuck duck = new MallardDuck();
		// ����һֻ��
		WildTurkey turkey = new WildTurkey();
		// ���𼦰�װ��һ�����������У�ʹ����������һֻѼ��
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		System.err.println("���𼦵ı���");
		turkey.gobble();
		turkey.fly();
		System.err.println("��Ѽ�ӵı���");
		testDuck(duck);
		System.err.println("�����������Ĺ�Ч");
		testDuck(turkeyAdapter);
	}

	/**
	 * ȡ��һֻѼ�ӣ����������ķ���
	 * 
	 * @param duck
	 */
	private static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}

package structural.adapter.example_two;

/**
 * ����Ŀ���ֻ࣬�ṩ��ͨ����  
 * @author gang.wang
 *
 */
class ConcreteTarget implements Target {
	public void request() {
		System.out.println("��ͨ�� ���� ��ͨ����...");
	}
}
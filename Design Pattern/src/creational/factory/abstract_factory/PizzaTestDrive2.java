package creational.factory.abstract_factory;

public class PizzaTestDrive2 {
	public static void main(String[] args) {
		// ������Ҫһ��ŦԼ������
		PizzaStore nyPizzaStore = new NYPizzaStore();
		// �����ˣ���ʼ���ܶ�����
		nyPizzaStore.orderPizza("cheese");

	}
}

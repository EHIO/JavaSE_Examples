package creational.factory.factory_method;

public class ChicagoStyleCheesePizza extends Pizza {
	public ChicagoStyleCheesePizza() {
		name = "֥�Ӹ��ζ��ƥ��";
		dough = "������";
		sauce = "���ѽ�";

		toppings.add("Ī������֥ʿ��");// ���渲�ǵ��������reggiano�߼�����
	}

	public void cut() {
		System.out.println("�������гɷ���Ƭ");
	}
}

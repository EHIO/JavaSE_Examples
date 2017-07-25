package creational.factory.abstract_factory;

/**
 * ����
 */
public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies[] veggies;
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clams;

	/**
	 * ���@�e�ռ����_����Ҫ��ԭ�ϣ����@Щԭ�ρ����ԭ�Ϲ��S
	 */
	abstract void prepare();

	void bake() {
		System.out.println("��350�ȵ��¶��¿�25����");
	}

	void cut() {
		System.out.println("�������г�бƬ");
	}

	void box() {
		System.out.println("�����ڹٷ�ƥ���̵������");
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}
}

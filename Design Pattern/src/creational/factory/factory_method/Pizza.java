package creational.factory.factory_method;

import java.util.ArrayList;

public abstract class Pizza {
	/** ���� */
	String name;
	/** �������� */
	String dough;
	/** �������� */
	String sauce;
	/** һ������ */
	ArrayList toppings = new ArrayList();

	public String getName() {
		return name;
	}

	/**
	 * ׼��
	 */
	public void prepare() {
		System.out.println("׼�� " + name);
		System.out.println("������...");
		System.out.println("�ӽ���...");
		System.out.println("������: ");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("     " + toppings.get(i));
		}
	}

	/**
	 * �濾
	 */
	public void bake() {
		System.out.println("��350�ȵ��¶��¿�25����");

	}

	/**
	 * ��Ƭ
	 */
	public void cut() {
		System.out.println("�������г�бƬ");
	}

	/**
	 * װ��
	 */
	public void box() {
		System.out.println("�����ڹٷ�ƥ���̵������");
	}

}

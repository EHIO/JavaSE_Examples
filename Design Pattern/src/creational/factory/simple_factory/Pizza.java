package creational.factory.simple_factory;

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
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for(int i = 0; i < toppings.size(); i++) {
			System.out.println("  " + toppings.get(i));
		}
	}

	/**
	 * �濾
	 */
	public void bake() {
		System.out.println("��350�ȵ��¶��¿�25����" );
				
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
		System.out.println("����װ�ڹٷ�ƥ���̵����");
	}

}

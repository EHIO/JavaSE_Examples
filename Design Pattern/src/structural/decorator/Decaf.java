package structural.decorator;

/**
 * �Ϳ�����, ��װ�ε����
 */
public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf";
	}

	@Override
	public double cost() {

		return 1.05;
	}

}

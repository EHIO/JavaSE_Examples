package structural.decorator;

/**
 * �ۺϿ���, ��װ�ε����
 */
public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "�ۺϿ���";
	}

	@Override
	public double cost() {

		return 0.89;
	}

}

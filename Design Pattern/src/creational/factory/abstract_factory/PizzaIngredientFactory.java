package creational.factory.abstract_factory;

/**
 * ԭ�Ϲ��S��������a�u�����_��ԭ�ϡ����磺�I�F���u�ϡ�֥ʿ������߲�
 */
public interface PizzaIngredientFactory {
	/**
	 * ���a�I�Fԭ��
	 * 
	 * @return ����ԭ��
	 */
	public Dough createDough();

	/**
	 * ���a�u��ԭ��
	 * 
	 * @return �u��ԭ��
	 */
	public Sauce createSauce();

	/**
	 * ���a֥ʿԭ��
	 * 
	 * @return ֥ʿԭ��
	 */
	public Cheese createCheese();

	/**
	 * ���a�߲�ԭ��
	 * 
	 * @return �߲�ԭ��
	 */
	public Veggies[] createVeggies();

	/**
	 * ���a��������cԭ��
	 * 
	 * @return ��������cԭ��
	 */
	public Pepperoni createPepperoni();

	/**
	 * ���a����ԭ��
	 * 
	 * @return ����ԭ��
	 */
	public Clams createClam();
}

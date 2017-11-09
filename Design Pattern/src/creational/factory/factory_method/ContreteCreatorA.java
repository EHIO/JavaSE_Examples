package creational.factory.factory_method;

public class ContreteCreatorA extends Creator {
	@Override
	public Product factoryMethod() {
		return new ContreteProductA();
	}
}

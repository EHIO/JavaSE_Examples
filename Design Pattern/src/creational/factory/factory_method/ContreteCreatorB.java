package creational.factory.factory_method;

public class ContreteCreatorB extends Creator {
	@Override
	public Product factoryMethod() {
		return new ContreteProductB();
	}
}

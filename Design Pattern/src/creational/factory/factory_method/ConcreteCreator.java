package creational.factory.factory_method;

/**
 * 具体的创建者
 */
public class ConcreteCreator extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}

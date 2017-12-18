package creational.factory.factory_method.example_1;

/**
 * 具体的创建者
 *
 * @author wg
 */
public class ContreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ContreteProductB();
    }
}

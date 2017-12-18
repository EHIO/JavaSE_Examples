package creational.factory.factory_method.example_1;

/**
 * @author wg
 */
public class FactoryMethodTest {

    public static void main(String[] args) {

        Creator creator = new ContreteCreatorA();
        creator.factoryMethod();
    }
}

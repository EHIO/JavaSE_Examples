package creational.factory.factory_method;

/**
 * Created by run on 2017/11/5.
 */
public class FactoryMethodTest {

    public static void main(String[] args) {

        Creator creator = new ConcreteCreator();
        creator.factoryMethod();
    }
}

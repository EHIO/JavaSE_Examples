package creational.factory.factory_method.example_1;

/**
 * Created by run on 2017/11/5.
 */
public class FactoryMethodTest {

    public static void main(String[] args) {

        Creator creator = new ContreteCreatorA();
        creator.factoryMethod();
    }
}

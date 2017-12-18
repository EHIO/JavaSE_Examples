package creational.factory.factory_method.example_1;

public class Test {

    public static void main(String[] args) {
        Creator creator = new ContreteCreatorA();
        creator.factoryMethod();

        creator = new ContreteCreatorB();
        creator.factoryMethod();
    }
}

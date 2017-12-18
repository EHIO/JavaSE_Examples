package creational.factory.simple_factory.example_2;

public class IPhoneTestDrive {

    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        IPhoneStore store = new IPhoneStore(factory);
        IPhone iPhone = store.order("iphone4");
        System.out.println(iPhone.getName());
    }
}

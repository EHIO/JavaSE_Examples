package creational.factory.simple_factory.example_2;

public class SimpleFactory {

    public IPhone create(String type) {
        IPhone phone = null;
        if ("iphone4".equals(type)) {
            phone = new IPhone4();
        } else if ("iphone5".equals(type)) {
            phone = new IPhone5();
        }
        return phone;
    }
}

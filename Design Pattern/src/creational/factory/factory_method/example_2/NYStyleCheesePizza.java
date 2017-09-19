package creational.factory.factory_method.example_2;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "纽约风味的匹萨";
        dough = "薄面团";
        sauce = "多味酱料";

        toppings.add("意大利高级干酪");
    }
}

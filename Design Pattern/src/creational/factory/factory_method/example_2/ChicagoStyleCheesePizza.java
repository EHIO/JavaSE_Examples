package creational.factory.factory_method.example_2;

/**
 * 芝加哥风味的芝士比萨
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "芝加哥风味的匹萨";
        dough = "厚面团";
        sauce = "番茄酱";

        toppings.add("莫萨里拉芝士条");// 上面覆盖的是意大利reggiano高级干洛
    }

    public void cut() {
        System.out.println("把披萨切成方形片");
    }
}

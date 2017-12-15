package structural.decorator.starbuzz;

/**
 * 星吧茲咖啡店
 *
 * @author wg
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        // 浓缩咖啡
        Beverage beverage = new Espresso();
        System.err.println(beverage.getDescription() + ",$" + beverage.cost());
        // 深焙咖啡
        Beverage beverage2 = new DarkRoast();
        // 两份摩卡和奶泡装饰深焙咖啡
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.err.println(beverage2.getDescription() + ",$" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Mocha(beverage3);
        beverage3 = new Soy(beverage3);
        beverage3 = new Whip(beverage3);
        System.err.println(beverage3.getDescription() + ",$" + beverage3.cost());
    }
}

package behavior.templatemethod.barista;

/**
 * 咖啡因的饮料
 *
 * @author wg
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * 冲泡
     */
    abstract void brew();

    /**
     * 添加调味品
     */
    abstract void addCondiments();

    void boilWater() {
        System.out.println("煮开水");
    }

    void pourInCup() {
        System.out.println("倒入杯中");
    }
}

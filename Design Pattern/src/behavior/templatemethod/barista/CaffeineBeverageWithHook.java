package behavior.templatemethod.barista;

public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
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

    /**
     * 钩子方法
     *
     * @return
     */
    boolean customerWantsCondiments() {
        return true;
    }
}

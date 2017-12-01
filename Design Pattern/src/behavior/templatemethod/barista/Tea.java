package behavior.templatemethod.barista;

/**
 * 茶
 *
 * @author wg
 */
public class Tea extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("冲泡茶");
    }

    @Override
    public void addCondiments() {
        System.out.println("加柠檬");
    }
}

package behavior.templatemethod.barista;

public class BeverageTestDrive {
    public static void main(String[] args) {

        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("\n制作茶...");
        tea.prepareRecipe();

        System.out.println("\n制作咖啡...");
        coffee.prepareRecipe();


        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\n制作茶...");
        teaHook.prepareRecipe();

        System.out.println("\n制作咖啡...");
        coffeeHook.prepareRecipe();
    }
}

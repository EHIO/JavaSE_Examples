package structural.decorator.practise;

public class Test {

    public static void main(String[] args) {
        Beverage decaf = new Decaf();
        System.out.println(decaf.getDescription());

        Beverage soy = new Soy(decaf);
        Beverage whip = new Whip(soy);
        System.out.println(whip.getDescription() + "， 价钱：$" + whip.cost());
    }
}

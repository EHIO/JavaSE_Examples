package structural.decorator;

/**
 * ÒûÁÏ
 */
public abstract class Beverage {
	String description = "Î´ÖªÒûÁÏ";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}

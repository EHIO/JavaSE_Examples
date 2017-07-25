package structural.adapter.example_one;

/**
 * ÂÌÍ·Ñ¼
 */
public class MallardDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("¸Â¸Â½Ğ");
	}

	@Override
	public void fly() {
		System.out.println("ÕıÔÚ·É");
	}

}

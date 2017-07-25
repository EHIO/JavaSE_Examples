package structural.adapter.example_one;

/**
 * 具体的火鸡
 * @author gang.wang
 *
 */
public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("咕咕叫");
	}

	@Override
	public void fly() {
		System.out.println("很想飞");
	}

}

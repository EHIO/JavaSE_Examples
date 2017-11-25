package structural.facade.example;

public class Client {
	private static SecurityFacade sf;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sf = new SecurityFacade();
		sf.on();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sf.off();
	}

}

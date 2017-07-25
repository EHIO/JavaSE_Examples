package behavior.command;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Recevier rece = new Recevier();
		Command comm = new ConereteCommand(rece);
		Invoker in = new Invoker(comm);
		in.action();
	}

}

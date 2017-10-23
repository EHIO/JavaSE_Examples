package behavior.command;

/**
 * 调用者
 */
public class Invoker {
	private Command comm;
	
	public Invoker(Command comm) {
		super();
		this.comm = comm;
	}

	public void action() {
		comm.execute();
	}
}

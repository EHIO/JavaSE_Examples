package behavior.command;

public class ConereteCommand extends Command {
	private Recevier rece;
	
	public ConereteCommand(Recevier rece) {
		super();
		this.rece = rece;
	}

	@Override
	public void execute() {
		rece.action();
	}

}

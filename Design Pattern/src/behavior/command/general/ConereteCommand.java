package behavior.command.general;

public class ConereteCommand implements Command {
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

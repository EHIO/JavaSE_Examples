package behavior.command.remote;
/**
 * 热水浴缸打开命令
 */
public class HottubOnCommand implements Command {
	Hottub hottub;

	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	@Override
	public void execute() {
		hottub.on();
		hottub.heat();
		hottub.bubblesOn();
	}
}

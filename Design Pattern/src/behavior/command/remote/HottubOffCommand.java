package behavior.command.remote;

/**
 * 热水浴缸关闭命令
 */
public class HottubOffCommand implements Command {
	Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	@Override
	public void execute() {
		hottub.cool();
		hottub.off();
	}
}

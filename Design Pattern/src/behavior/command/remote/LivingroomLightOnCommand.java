package behavior.command.remote;
/**
 * 客厅灯打开命令
 */
public class LivingroomLightOnCommand implements Command {
	Light light;

	public LivingroomLightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}
}

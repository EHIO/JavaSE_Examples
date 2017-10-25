package behavior.command.remote;

/**
 * 客厅灯关闭命令
 */
public class LivingroomLightOffCommand implements Command {
	Light light;

	public LivingroomLightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}
}

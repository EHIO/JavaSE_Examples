package behavior.command.simpleremote;

/**
 * 关闭电灯命令
 */
public class LightOffCommand implements Command {
	Light light;
 
	public LightOffCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.off();
	}
}

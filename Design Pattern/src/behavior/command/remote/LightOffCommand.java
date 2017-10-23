package behavior.command.remote;

/**
 * �ص�����
 * @ClassName: LightOffCommand 
 * @Description: TODO(������һ�仰��������������) 
 * @author A18ccms a18ccms_gmail_com 
 * @date 2016-2-15 ����5:50:49
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

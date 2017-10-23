package behavior.command.remote;

/**
 * ��������
 * @ClassName: LightOnCommand 
 * @Description: TODO(������һ�仰��������������) 
 * @author A18ccms a18ccms_gmail_com 
 * @date 2016-2-15 ����5:48:13
 */
public class LightOnCommand implements Command {
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}
}

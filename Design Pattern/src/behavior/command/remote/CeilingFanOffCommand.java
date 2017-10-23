package behavior.command.remote;

/**
 * �ر��컨����ȵ�����
 * @ClassName: CeilingFanOffCommand 
 * @Description: TODO(������һ�仰��������������) 
 * @author A18ccms a18ccms_gmail_com 
 * @date 2016-2-15 ����5:57:45
 */
public class CeilingFanOffCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	public void execute() {
		ceilingFan.off();
	}
}

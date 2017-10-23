package behavior.command.remote;

/**
 * �����컨����ȵ�����
 * @ClassName: CeilingFanOnCommand 
 * @Description: TODO(������һ�仰��������������) 
 * @author A18ccms a18ccms_gmail_com 
 * @date 2016-2-15 ����5:53:20
 */
public class CeilingFanOnCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.high();
	}
}

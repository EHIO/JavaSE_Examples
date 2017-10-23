package behavior.command.simpleremote;

/**
 * 简单的远程控制器：调用者
 */
public class SimpleRemoteControl {
	Command slot;
 
	public SimpleRemoteControl() {}
 
	public void setCommand(Command command) {
		slot = command;
	}
 
	/**
	 * 按键被按下
	 */
	public void buttonWasPressed() {
		slot.execute();
	}
}

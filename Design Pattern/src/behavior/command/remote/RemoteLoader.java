package behavior.command.remote;

public class RemoteLoader {
 
	public static void main(String[] args) {
		//����Invoker(������)
		RemoteControl remoteControl = new RemoteControl();
 
		Light livingRoomLight = new Light("����");
		Light kitchenLight = new Light("����");
		CeilingFan ceilingFan= new CeilingFan("����");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("����");
  
		/*
		 * �������еĵ��������� 
		 */
		LightOnCommand livingRoomLightOn = 
				new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = 
				new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = 
				new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = 
				new LightOffCommand(kitchenLight);
  
		/*
		 * �������ȵĿ��������
		 */
		CeilingFanOnCommand ceilingFanOn = 
				new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = 
				new CeilingFanOffCommand(ceilingFan);
 
		/*
		 * ���������ŵ�����������
		 */
		GarageDoorUpCommand garageDoorUp =
				new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown =
				new GarageDoorDownCommand(garageDoor);
 
		/*
		 * ��������Ŀ��������
		 */
		StereoOnWithCDCommand stereoOnWithCD =
				new StereoOnWithCDCommand(stereo);
		StereoOffCommand  stereoOff =
				new StereoOffCommand(stereo);
 
		/*
		 * ��������ȫ����� �����Ǽ��ص�ң���������
		 */
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
  
		System.out.println(remoteControl);
		/*
		 * һ��׼�����������ڣ� �𲽰���ÿ����۵Ŀ���ذ�ť
		 */
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
	}
}

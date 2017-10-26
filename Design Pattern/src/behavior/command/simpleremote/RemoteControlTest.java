package behavior.command.simpleremote;

public class RemoteControlTest {
    public static void main(String[] args) {
        // Invoker
        SimpleRemoteControl remote = new SimpleRemoteControl();
        // 实际的接收者Receiver
        Light light = new Light();
        // 实际的接收者Receiver
        GarageDoor garageDoor = new GarageDoor();
        // 电灯打开命令
        LightOnCommand lightOn = new LightOnCommand(light);
        // 车库门打开命令
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}

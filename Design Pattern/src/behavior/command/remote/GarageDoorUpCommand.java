package behavior.command.remote;

/**
 * 车库门上升命令
 */
public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}

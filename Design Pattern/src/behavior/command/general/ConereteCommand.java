package behavior.command.general;

/**
 * 具体的命令
 */
public class ConereteCommand implements Command {
    private Recevier rece;

    public ConereteCommand(Recevier rece) {
        super();
        this.rece = rece;
    }

    @Override
    public void execute() {
        rece.action();
    }

}

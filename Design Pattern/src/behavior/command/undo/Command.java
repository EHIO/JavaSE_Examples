package behavior.command.undo;

/**
 * 命令接口
 */
public interface Command {
    public void execute();

    /**
     * 撤消命令
     */
    public void undo();
}

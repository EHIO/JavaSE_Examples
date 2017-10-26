package behavior.command.undo;

/**
 * 调光灯关闭命令
 */
public class DimmerLightOffCommand implements Command {
    Light light;

    /**
     * 上一次级别
     */
    int prevLevel;

    public DimmerLightOffCommand(Light light) {
        this.light = light;
        prevLevel = 100;
    }

    @Override
    public void execute() {
        prevLevel = light.getLevel();
        light.off();
    }

    @Override
    public void undo() {
        light.dim(prevLevel);
    }
}

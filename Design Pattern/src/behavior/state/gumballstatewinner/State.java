package behavior.state.gumballstatewinner;

public interface State {

    /**
     * 投币，当投入硬币进来， 就执行此方法
     */
    public void insertQuarter();

    /**
     * 退币
     */
    public void ejectQuarter();

    /**
     * 转动曲柄
     */
    public void turnCrank();

    /**
     * 发放
     */
    public void dispense();

    /**
     * 补充
     */
    public void refill();
}

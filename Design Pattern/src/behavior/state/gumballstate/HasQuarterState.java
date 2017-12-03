package behavior.state.gumballstate;

/**
 * 投过币的状态
 */
public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("您已经投过硬币了");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("退币成功");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("转动曲柄开关...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("没有糖果出售");
    }

    @Override
    public void refill() {
    }

    @Override
    public String toString() {
        return "已投币， 等待转动曲柄";
    }
}

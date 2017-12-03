package behavior.state.gumballstatewinner;

/**
 * 售馨状态
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("糖果已经售馨");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("你不能弹出，你还没有投入硬币");
    }

    @Override
    public void turnCrank() {
        System.out.println("糖果已经售馨");
    }

    @Override
    public void dispense() {
        System.out.println("糖果已经售馨");
    }

    @Override
    public void refill() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public String toString() {
        return "售馨";
    }
}

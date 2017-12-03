package behavior.state.gumballstatewinner;

/**
 * 幸运者
 */
public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("请稍等片刻， 您已经拿到一个糖果了");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("请稍等片刻， 您已经拿到一个糖果了");
    }

    @Override
    public void turnCrank() {
        System.out.println("转动两次不会给你另一个糖果");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            System.out.println("你是一个赢家!你的中了两个糖果");
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("哎呀,糖果!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

    @Override
    public void refill() {
    }

    @Override
    public String toString() {
        return "您是幸运者， 拿到两份";
    }
}

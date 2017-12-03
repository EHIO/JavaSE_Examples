package behavior.state.gumballstatewinner;

/**
 * 售出状态
 */
public class SoldState implements State {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("请稍等片刻， 您已经拿到一个糖果了");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("对不起，你已经转动曲柄了");
    }

    @Override
    public void turnCrank() {
        System.out.println("转动两次不会给你另一个糖果!!");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("请拿好您的糖果， 欢迎下次光临!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public void refill() {
    }

    @Override
    public String toString() {
        return "交付一个糖果";
    }
}

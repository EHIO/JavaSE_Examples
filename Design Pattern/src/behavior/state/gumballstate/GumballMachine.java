package behavior.state.gumballstate;

public class GumballMachine {
    /**
     * 售馨状态
     */
    State soldOutState;
    /**
     * 未投币状态
     */
    State noQuarterState;
    /**
     * 已投币状态
     */
    State hasQuarterState;
    /**
     * 售出状态
     */
    State soldState;

    State state;
    int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void releaseBall() {
        System.out.println("一个糖果滚出了槽口...");
        if (count != 0) {
            count = count - 1;
        }
    }

    int getCount() {
        return count;
    }

    void refill(int count) {
        this.count += count;
        System.out.println("糖果机器刚刚被重新填满;这是新的计数: " + this.count);
        state.refill();
    }

    void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\n万能糖果机.");
        result.append("\n为你提供服务\n");
        result.append("存货: " + count + " 个糖果");
        result.append("\n");
        return result.toString();
    }
}

package behavior.state.gumball;

/**
 * 万能糖果机
 */
public class GumballMachine {

    /**
     * 售馨状态
     */
    final static int SOLD_OUT = 0;
    /**
     * 没有投币状态
     */
    final static int NO_QUARTER = 1;

    /**
     * 投入币状态
     */
    final static int HAS_QUARTER = 2;
    /**
     * 售出状态
     */
    final static int SOLD = 3;

    /**
     * 糖果机初始状态：售馨
     */
    int state = SOLD_OUT;
    /**
     * 糖果机中的糖果数
     */
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    /**
     * 投币，当投入硬币进来， 就执行此方法
     */
    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("您已经投过硬币了");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("投币成功");
        } else if (state == SOLD_OUT) {
            System.out.println("糖果已经卖完了");
        } else if (state == SOLD) {
            System.out.println("请稍等片刻， 您已经拿到一个糖果了");
        }
    }

    /**
     * 退币方法
     */
    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("退币成功");
            // 回到需要投币状态
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("您没有投币");
        } else if (state == SOLD) {
            System.out.println("对不起，您已经转动曲柄了");
        } else if (state == SOLD_OUT) {
            System.out.println("你不能弹出，你还没有插入硬币");
        }
    }

    /**
     * 转动曲柄
     */
    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("转动两次不会给你另一个糖果!");
        } else if (state == NO_QUARTER) {
            System.out.println("您需要投币");
        } else if (state == SOLD_OUT) {
            System.out.println("已经售馨");
        } else if (state == HAS_QUARTER) {
            System.out.println("成功...");
            // 转变为售出状态
            state = SOLD;
            // 发放
            dispense();
        }
    }

    /**
     * 发放糖果
     */
    private void dispense() {
        if (state == SOLD) {
            System.out.println("请拿好您的糖果， 欢迎下次光临");
            count = count - 1;
            if (count == 0) {
                System.out.println("哎呀， 糖果售馨!");
                // 转变为售馨状态
                state = SOLD_OUT;
            } else {
                // 还有糖果， 回到需要投币状态
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("请先投币");
        } else if (state == SOLD_OUT) {
            System.out.println("没有糖果出售");
        } else if (state == HAS_QUARTER) {
            System.out.println("没有糖果出售");
        }
    }

    /**
     * 补充
     *
     * @param numGumBalls
     */
    public void refill(int numGumBalls) {
        this.count = numGumBalls;
        state = NO_QUARTER;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\n万能糖果机.");
        result.append("\n为你提供服务\n");
        result.append("存货: " + count + " 个糖果");
        result.append("\n机器是 ");
        if (state == SOLD_OUT) {
            result.append("售罄");
        } else if (state == NO_QUARTER) {
            result.append("等待投币");
        } else if (state == HAS_QUARTER) {
            result.append("等待转动曲柄");
        } else if (state == SOLD) {
            result.append("交付一个糖果");
        }
        result.append("\n");
        return result.toString();
    }
}



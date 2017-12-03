package behavior.state.gumball;

public class GumballMachineTestDrive {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        // 打印机器的状态
        System.out.println(gumballMachine);
        // 投入一个硬币
        gumballMachine.insertQuarter();
        // 转动曲柄
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        // 投入一个硬币
        gumballMachine.insertQuarter();
        // 退币
        gumballMachine.ejectQuarter();
        // 转动曲柄
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        // 投入一个硬币
        gumballMachine.insertQuarter();
        // 转动曲柄
        gumballMachine.turnCrank();
        // 投入一个硬币
        gumballMachine.insertQuarter();
        // 转动曲柄
        gumballMachine.turnCrank();
        // 退币
        gumballMachine.ejectQuarter();

        System.out.println(gumballMachine);

        // 投入一个硬币
        gumballMachine.insertQuarter();
        // 投入一个硬币
        gumballMachine.insertQuarter();
        // 转动曲柄
        gumballMachine.turnCrank();
        // 投入一个硬币
        gumballMachine.insertQuarter();
        // 转动曲柄
        gumballMachine.turnCrank();
        // 投入一个硬币
        gumballMachine.insertQuarter();
        // 转动曲柄
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}

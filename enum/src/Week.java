/**
 * Created by run on 2017/8/12.
 */
public enum Week {
    MON, TUE, WED, THU, FRI, SAT, SUN;


    public static void main(String[] args) {
        for (Week week : Week.values()) {
            System.out.println(week + "--" + week.ordinal());
        }


        System.out.println("----------------我是分隔线------------------");

        Week test = Week.TUE;
        switch (test) {
            case MON:
                System.out.println("今天是星期一");
                break;
            case TUE:
                System.out.println("今天是星期二");
                break;
            case WED:
                System.out.println("今天是星期三");
                break;
            case THU:
                System.out.println("今天是星期四");
                break;
            case FRI:
                System.out.println("今天是星期五");
                break;
            case SAT:
                System.out.println("今天是星期六");
                break;
            case SUN:
                System.out.println("今天是星期天");
                break;
            /*default:
                System.out.println(test);
                break;*/
        }
    }
}

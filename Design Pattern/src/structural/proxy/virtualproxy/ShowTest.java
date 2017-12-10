package structural.proxy.virtualproxy;

/**
 * Created by run on 2017/12/11.
 */
public class ShowTest {


    public static void main(String[] args) throws InterruptedException {
        Show show = new ShowProxy();
        show.show();
        Thread.sleep(1000);
        show.show();
    }
}

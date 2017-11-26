package structural.facade.example;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        /**
         * 子系统
         */
        Light light = new Light("阿拉丁神灯");
        Camera camera = new Camera("遗像录像机");
        SecurityFacade sf = new SecurityFacade(light, camera);
        sf.on();
        Thread.sleep(1000);
        sf.off();
    }

}

package structural.facade.hometheater;

public class HomeTheaterTestDrive {
    public static void main(String[] args) throws InterruptedException {
        Amplifier amp = new Amplifier();
        DvdPlayer dvd = new DvdPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, projector, lights, screen, popper);
        homeTheater.watchMovie("人鬼情未了");
        Thread.sleep(1000);
        System.err.println("------------------------");
        homeTheater.endMovie();
    }
}

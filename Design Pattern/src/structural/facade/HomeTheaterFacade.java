package structural.facade;
/**
 * ��ͥӰԺ���
 */
public class HomeTheaterFacade {
	Amplifier amp;
	Tuner tuner;
	DvdPlayer dvd;
	CdPlayer cd;
	Projector projector;
	TheaterLights lights;
	Screen screen;
	PopcornPopper popper;
	
	public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd,
			CdPlayer cd, Projector projector, TheaterLights lights,
			Screen screen, PopcornPopper popper) {
		this.amp = amp;
		this.tuner = tuner;
		this.dvd = dvd;
		this.cd = cd;
		this.projector = projector;
		this.lights = lights;
		this.screen = screen;
		this.popper = popper;
	}
	
	public void watchMovie(String movie) {
		System.out.println("׼������Ӱ�ˡ���������");
		popper.on();
		popper.pop();
		lights.dim();
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setDvd(dvd);
		amp.setVolume();
		dvd.on();
		dvd.play(movie);
	}
	
	public void endMovie() {
		System.out.println("��Ӱ�����ˣ�׼���رռ�ͥӰԺ");
		popper.off();
		lights.on();
		screen.up();
		projector.off();
		amp.off();
		dvd.stop();
		dvd.eject();
		dvd.off();
	}
}

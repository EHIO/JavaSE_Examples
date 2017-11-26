package behavior.observer.weatherobservable;

import java.util.Observable;
import java.util.Observer;

/**
 * 天气预报布告板， 一个具体的观察者
 *
 * @author wg
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.print("预报: ");
        if (currentPressure > lastPressure) {
            System.out.println("天气改善!");
        } else if (currentPressure == lastPressure) {
            System.out.println("天气不变");
        } else if (currentPressure < lastPressure) {
            System.out.println("小心凉爽、多雨的天气");
        }
    }
}

package behavior.observer.weatherobservable;

import java.util.Observable;
import java.util.Observer;

/**
 * 目前状况布告板，一个具体的观察者
 *
 * @author wg
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    Observable observable;

    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("当前情况： " + temperature + "华氏度(℉) 和 " + humidity + "%湿度");
    }
}

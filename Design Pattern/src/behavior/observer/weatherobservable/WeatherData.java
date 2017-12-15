package behavior.observer.weatherobservable;

import java.util.Observable;

/**
 * 气象站：具体主题
 *
 * @author wg
 */
public class WeatherData extends Observable {
    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;
    /**
     * 气压
     */
    private float pressure;

    public WeatherData() {
    }

    /**
     * 通知观察者
     */
    public void measurementsChanged() {
        // 标识主题（可观察者）已更改
        setChanged();
        // 通知观察者
        notifyObservers();
    }

    /**
     * 设置测量值
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}

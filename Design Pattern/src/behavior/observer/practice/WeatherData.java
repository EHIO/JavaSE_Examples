package behavior.observer.practice;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    List<Observer> observers;

    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        if (observer == null) {
            throw new NullPointerException();
        }
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notityObserver(Object arg) {
        for (Observer observer : observers) {
            observer.update(this, arg);
        }
    }

    /**
     * 设置观测值
     * @param temperature
     * @param humidity
     */
    public void setMeasurements(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        setChange();
    }

    /**
     * 数据备妥后， 就调用此方法
     */
    private void setChange() {
        notityObserver(null);
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}

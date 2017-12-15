package behavior.observer.weather;

/**
 * 目前状况布告板，一个具体的观察者
 *
 * @author wg
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;

    private Subject weatherData;

    /**
     * 包含主题的引用， 作为注册之用
     *
     * @param weatherData
     */
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("当前情况： " + temperature + "华氏度(℉) 和 " + humidity + "%湿度");
    }
}

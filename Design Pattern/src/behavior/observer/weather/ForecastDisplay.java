package behavior.observer.weather;

/**
 * 天气预报布告板， 一个具体的观察者
 *
 * @author wg
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }

    @Override
    public void display() {
        System.out.print("天气预报: ");
        if (currentPressure > lastPressure) {
            System.out.println("天气改善!");
        } else if (currentPressure == lastPressure) {
            System.out.println("天气不变");
        } else if (currentPressure < lastPressure) {
            System.out.println("小心凉爽、多雨的天气");
        }
    }
}

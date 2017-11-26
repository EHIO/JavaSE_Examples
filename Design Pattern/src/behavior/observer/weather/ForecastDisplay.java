package behavior.observer.weather;

/**
 * ����Ԥ������壬 һ������Ĺ۲���
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
        System.out.print("Ԥ��: ");
        if (currentPressure > lastPressure) {
            System.out.println("��������!");
        } else if (currentPressure == lastPressure) {
            System.out.println("��������");
        } else if (currentPressure < lastPressure) {
            System.out.println("С����ˬ�����������");
        }
    }
}

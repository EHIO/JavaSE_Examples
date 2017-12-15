package behavior.observer.practice;

public class WeatherDataDriveTest {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Observer currentConditions = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(30.0f, 55.5f);
    }
}

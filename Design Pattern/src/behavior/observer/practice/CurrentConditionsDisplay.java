package behavior.observer.practice;


public class CurrentConditionsDisplay implements Observer, DisplayElement {

    Subject subject;

    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;

    public CurrentConditionsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(Subject subject, Object arg) {
        WeatherData weatherData = (WeatherData) subject;
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("当前状况： " + temperature + "摄氏度(℃), 温度：" + this.humidity + "%");
    }
}

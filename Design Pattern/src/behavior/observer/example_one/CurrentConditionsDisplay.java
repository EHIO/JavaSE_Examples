package behavior.observer.example_one;

/**
 * 目前状况布告板
 * @ClassName: CurrentConditionsDisplay 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author A18ccms a18ccms_gmail_com 
 * @date 2016-1-4 下午11:47:36
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
	 * 需要包存主题的引用， 作为注册之用
	 * <p>Title: </p> 
	 * <p>Description: </p> 
	 * @param weatherData
	 */
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		System.out.println("当前情况: " + temperature 
			+ "F 度 和 " + humidity + "% 湿度");
	}
}

package behavior.observer.example_one;

/**
 * Ŀǰ״�������
 * @ClassName: CurrentConditionsDisplay 
 * @Description: TODO(������һ�仰��������������) 
 * @author A18ccms a18ccms_gmail_com 
 * @date 2016-1-4 ����11:47:36
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	/**
	 * �¶�
	 */
	private float temperature;
	/**
	 * ʪ��
	 */
	private float humidity;
	private Subject weatherData;
	
	/**
	 * ��Ҫ������������ã� ��Ϊע��֮��
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
		System.out.println("��ǰ���: " + temperature 
			+ "F �� �� " + humidity + "% ʪ��");
	}
}

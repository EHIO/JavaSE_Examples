package behavior.observer.example_one;

import java.util.*;
/**
 * ��������
 * @ClassName: WeatherData 
 * @Description: TODO(������һ�仰��������������) 
 * @author A18ccms a18ccms_gmail_com 
 * @date 2016-1-4 ����11:41:15
 */
public class WeatherData implements Subject {
	private ArrayList<Observer> observers;
	/**
	 * �¶�
	 */
	private float temperature;
	/**
	 * ʪ��
	 */
	private float humidity;
	/**
	 * ��ѹ
	 */
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}
	/**
	 * ���µĲ������ݱ���ʱ���˷����ͻᱻ����
	 * <p>Title: </p> 
	 * <p>Description: </p>
	 */
	public void measurementsChanged() {
		notifyObservers();
	}
	
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

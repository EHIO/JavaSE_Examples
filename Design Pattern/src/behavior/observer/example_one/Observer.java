package behavior.observer.example_one;
/**
 * @ClassName: Observer 
 * @Description: 观察者接口
 * @author A18ccms a18ccms_gmail_com 
 * @date 2016-1-4 下午11:31:15
 */
public interface Observer {
	/**
	 * 
	 * <p>Title: </p> 
	 * <p>Description: 当气象观测值改变时， 主题会把这些状态值当作方法的参数
	 * 传递给观察者</p> 
	 * @param temp 温度
	 * @param humidity 湿度
	 * @param pressure 气压
	 */
	public void update(float temp, float humidity, float pressure);
}

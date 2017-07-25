package behavior.observer.example_one;
/**
 * @ClassName: Subject 
 * @Description: 主题 
 * @author A18ccms a18ccms_gmail_com 
 * @date 2016-1-2 下午6:18:40
 */
public interface Subject {
	/**
	 * 
	 * <p>Title: </p> 
	 * <p>Description: 注册观察者</p> 
	 * @param o
	 */
	public void registerObserver(Observer o);
	/**
	 * 
	 * <p>Title: </p> 
	 * <p>Description: 删除观察者 </p> 
	 * @param o
	 */
	public void removeObserver(Observer o);
	
	/**
	 * 当主题状态改变时， 这个方法会被调用， 以通知所有的观察者
	 */
	public void notifyObservers();
}

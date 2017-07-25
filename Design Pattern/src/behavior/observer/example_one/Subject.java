package behavior.observer.example_one;
/**
 * @ClassName: Subject 
 * @Description: ���� 
 * @author A18ccms a18ccms_gmail_com 
 * @date 2016-1-2 ����6:18:40
 */
public interface Subject {
	/**
	 * 
	 * <p>Title: </p> 
	 * <p>Description: ע��۲���</p> 
	 * @param o
	 */
	public void registerObserver(Observer o);
	/**
	 * 
	 * <p>Title: </p> 
	 * <p>Description: ɾ���۲��� </p> 
	 * @param o
	 */
	public void removeObserver(Observer o);
	
	/**
	 * ������״̬�ı�ʱ�� ��������ᱻ���ã� ��֪ͨ���еĹ۲���
	 */
	public void notifyObservers();
}

package behavior.observer.example_one;
/**
 * @ClassName: Observer 
 * @Description: �۲��߽ӿ�
 * @author A18ccms a18ccms_gmail_com 
 * @date 2016-1-4 ����11:31:15
 */
public interface Observer {
	/**
	 * 
	 * <p>Title: </p> 
	 * <p>Description: ������۲�ֵ�ı�ʱ�� ��������Щ״ֵ̬���������Ĳ���
	 * ���ݸ��۲���</p> 
	 * @param temp �¶�
	 * @param humidity ʪ��
	 * @param pressure ��ѹ
	 */
	public void update(float temp, float humidity, float pressure);
}

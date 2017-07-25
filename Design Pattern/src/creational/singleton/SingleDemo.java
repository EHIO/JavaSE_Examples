package creational.singleton;

/*
1,�������ģʽ:
		����ʽ����һ���ؾʹ�������   
		����ʽ���õ�ʱ�򣬲�ȥ�������� 
		��������⣺���ǿ��Ա�֤һ�������ڴ��еĶ���Ψһ�ԡ�

	������ڶ������ʹ��ͬһ��������Ϣ����ʱ������Ҫ��֤�ö����Ψһ�ԡ�

��α�֤����Ψһ���أ�
1������������������new�����������
2���ڸ��ഴ��һ������ʵ����
3�������ṩһ������������������Ի�ȡ�ö���

���裺
1��˽�л����๹�캯����
2��ͨ��new�ڱ����д���һ���������
3������һ�����еķ������������Ķ��󷵻ء�

*/
/*
 * 
 * �����⣺����ģʽ��˼����ʲô?��дһ���������֡�
 * 
 * 		����������ʽ(�ǲ��������ĵ���ģʽ)
 * 		���ԣ�����ʽ(���ܻ������ĵ���ģʽ)
 * 			A:������(�ӳټ���)	
 * 			B:�̰߳�ȫ����
 * 				a:�Ƿ���̻߳���	��
 * 				b:�Ƿ��й�������	��
 * 				c:�Ƿ��ж����������������� 	��
 */

//����ʽ
class Single { // ��һ���أ�������Ѿ������ˡ�
	private static Single s = new Single();

	private Single() {
	}

	public static Single getInstance() {
		return s;
	}
}

// ����ʽ
class Single2 {// ����ؽ�����û�ж���ֻ�е�����getInstance����ʱ���Żᴴ������
// �ӳټ�����ʽ��

	private static Single2 s = null;

	private Single2() {
	}

	/*
	 * public synchronized static Single2 getInstance() { 
	 * 	if (s == null) { 
	 * 		s = new Single2(); 
	 * 	} 
	 * 	return s; 
	 * }
	 * 
	 */
	/*
	 * ����˫���жϿ��Խ��Ч������
	 */
	public static Single2 getInstance() {
		if (s == null) {
			synchronized (Single2.class) {
				if (s == null)
					// -->0 -->1
					s = new Single2();
			}
		}
		return s;
	}
}

class SingleDemo {
	public static void main(String[] args) {
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();

		System.out.println(s1 == s2);
	}
}

package org.wg.oop.innerclass.test;

class Outer3
{
	void method()
	{
		Object obj = new Object()
		{
			public void show()
			{
				System.out.println("show run");
			}

		};
		
//		obj.show();//��Ϊ�����ڲ�����������������ת��Ϊ��Object���͡�
					//�����Ͳ�����ʹ���������еķ����ˡ�


	}
}

class InnerClassTest3 
{
	public static void main(String[] args) 
	{
		new Outer3().method();
	}
}

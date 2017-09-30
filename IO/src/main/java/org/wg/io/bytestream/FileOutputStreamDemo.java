package org.wg.io.bytestream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

/*
 * IO���ķ��ࣺ
 * 		����
 * 			������	��ȡ����
 * 			����� д������
 * 		�������ͣ�
 * 			�ֽ���
 * 				�ֽ�������	��ȡ����	InputStream
 * 				�ֽ������	д������	OutputStream
 * 			�ַ���
 * 				�ַ�������	��ȡ����	Reader
 * 				�ַ������	д������	Writer
 * 
 * 		ע�⣺һ��������̽��IO����ʱ�����û����ȷ˵�������ַ�����˵��Ĭ��������ǰ��������������ֵġ�
 * 
 * �鿴FileOutputStream�Ĺ��췽����
 * 		FileOutputStream(File file) 
 *		FileOutputStream(String name)
 *
 * �ֽ�������������裺
 * 		A:�����ֽ����������
 * 		B:д����
 * 		C:�ͷ���Դ
 */
public class FileOutputStreamDemo {

	
	public void demo() throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream("f:temp/fos.txt");
		/*
		 * �����ֽ���������������˼������飺
		 * A:����ϵͳ����ȥ�����ļ�
		 * B:����fos����
		 * C:��fos����ָ������ļ�
		 */
		
		//д����
		fos.write("hello,IO".getBytes());
		fos.write("java".getBytes());
		
		//�ͷ���Դ
		//�رմ��ļ���������ͷ�������йص�����ϵͳ��Դ��
		fos.close();
		/*
		 * Ϊʲôһ��Ҫclose()��?
		 * A:���������������������Ϳ��Ա�����������������
		 * B:֪ͨϵͳȥ�ͷŸ����ļ���ص���Դ
		 */
		//java.io.IOException: Stream Closed
		//fos.write("java".getBytes());
	}
	
	/**
	 * public void write(int b):дһ���ֽ�
	 * public void write(byte[] b):дһ���ֽ�����
	 * public void write(byte[] b,int off,int len):дһ���ֽ������һ����
	 */
	@Test
	public void demo2() throws IOException {
		// �����ֽ����������
		// OutputStream os = new FileOutputStream("fos2.txt"); // ��̬
		FileOutputStream fos = new FileOutputStream("f:temp/fos.txt");

		// ����write()����
		//fos.write(97); //97 -- �ײ����������	-- ͨ�����±��� -- ��97��Ӧ���ַ�ֵ -- a
		// fos.write(57);
		// fos.write(55);
		
		//public void write(byte[] b):дһ���ֽ�����
		byte[] bys={97,98,99,100,101};
//		fos.write(bys);
		
		//public void write(byte[] b,int off,int len):дһ���ֽ������һ����
		fos.write(bys,1,3);
		
		//�ͷ���Դ
		fos.close();
	}
	
	/**
	 * ���ʵ�����ݵĻ���?
	 * 		Ϊʲô����û�л�����?��Ϊ��ֵд���ֽ����ݣ���û��д�뻻�з��š�
	 * 		���ʵ����?д�뻻�з��ż����¡�
	 * 		�ղ����ǿ�������д�ı��ļ����ǿ��Եģ�ͨ��windows�Դ����Ǹ����У�Ϊʲô��?
	 * 		��Ϊ��ͬ��ϵͳ��Բ�ͬ�Ļ��з���ʶ���ǲ�һ����?
	 * 		windows:\r\n
	 * 		linux:\n
	 * 		Mac:\r
	 * 		��һЩ�����ĸ��߼����±����ǿ���ʶ�����⻻�з��ŵġ�
	 * 
	 * ���ʵ�����ݵ�׷��д��?
	 * 		�ù��췽�����ڶ���������true���������
	 * @throws IOException 
	 */
	@Test
	public void demo3() throws IOException {
		/*
			 ����һ�������ָ�� name ���ļ���д�����ݵ�����ļ�����
			����ڶ�������Ϊ true�����ֽ�д���ļ�ĩβ����������д���ļ���ʼ����
		*/
		FileOutputStream fos = new FileOutputStream("F:temp/fos.txt", true);

		// д����
		for (int x = 0; x < 10; x++) {
			fos.write(("hello" + x).getBytes());
			fos.write("\r\n".getBytes());
		}

		// �ͷ���Դ
		fos.close();
	}
	
	/*
	 * �����쳣������ֽ����������
	 */
	public void demo4() {
		FileOutputStream fos = null;
		try {
			// fos = new FileOutputStream("z:\\fos4.txt");
			fos = new FileOutputStream("f:temp/fos.txt");
			fos.write("java".getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// ���fos����null������Ҫclose()
			if (fos != null) {
				// Ϊ�˱�֤close()һ����ִ�У��ͷŵ�������
				try {
					fos.close();
					fos = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

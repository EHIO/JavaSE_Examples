package org.wg.io.charstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ת����
 * InputStreamReader ���ֽ���ͨ���ַ���������
 * InputStreamReader(InputStream is):��Ĭ�ϵı����ȡ����
 * InputStreamReader(InputStream is,String charsetName):��ָ���ı����ȡ����
 */
public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		// ��������
		// InputStreamReader isr = new InputStreamReader(new FileInputStream(
		// "osw.txt"));

		// InputStreamReader isr = new InputStreamReader(new FileInputStream(
		// "osw.txt"), "GBK");

		InputStreamReader isr = new InputStreamReader(new FileInputStream(
				"osw.txt"), "UTF-8");

		// ��ȡ����
		// һ�ζ�ȡһ���ַ�
		int ch = 0;
		while ((ch = isr.read()) != -1) {
			System.out.print((char) ch);
		}

		// �ͷ���Դ
		isr.close();
	}
	
	public static void demo() throws IOException {
		// ��������
		InputStreamReader isr = new InputStreamReader(new FileInputStream(
				"StringDemo.java"));

		// һ�ζ�ȡһ���ַ�����
		char[] chs = new char[1024];
		int len = 0;
		while ((len = isr.read(chs)) != -1) {
			System.out.print(new String(chs, 0, len));
		}

		// �ͷ���Դ
		isr.close();
	}
}

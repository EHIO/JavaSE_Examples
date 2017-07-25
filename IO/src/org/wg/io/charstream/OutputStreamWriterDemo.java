package org.wg.io.charstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.junit.Test;

/*
 * OutputStreamWriter ���ַ���ͨ���ֽ���������
 * OutputStreamWriter(OutputStream out):����Ĭ�ϱ�����ֽ���������ת��Ϊ�ַ���
 * OutputStreamWriter(OutputStream out,String charsetName):
 * �ַ��� = �ֽ��� +�����
 */
public class OutputStreamWriterDemo {
	@Test
	public void demo() throws IOException {
		// ��������
		// OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
		// "osw.txt")); // Ĭ��GBK
		// OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
		// "osw.txt"), "GBK"); // ָ��GBK
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
				"f:temp/fos.txt"), "UTF-8"); // ָ��UTF-8
		// д����
		osw.write("�й�");

		// �ͷ���Դ
		osw.close();
	}
	@Test
	public void demo2() throws IOException {
		// ��������
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
				"osw2.txt"));

		// д����
		// public void write(int c):дһ���ַ�
		// osw.write('a');
		// osw.write(97);
		// Ϊʲô����û�н�ȥ��?
		// ԭ���ǣ��ַ� = 2�ֽ�
		// �ļ������ݴ洢�Ļ�����λ���ֽڡ�
		// void flush()

		// public void write(char[] cbuf):дһ���ַ�����
		// char[] chs = {'a','b','c','d','e'};
		// osw.write(chs);

		// public void write(char[] cbuf,int off,int len):дһ���ַ������һ����
		// osw.write(chs,1,3);

		// public void write(String str):дһ���ַ���
		// osw.write("�Ұ�����ϼ");

		// public void write(String str,int off,int len):дһ���ַ�����һ����
		osw.write("�Ұ�����ϼ", 2, 3);

		// ˢ�»�����
		osw.flush();
		// osw.write("�Ұ�����ϼ", 2, 3);

		// �ͷ���Դ
		osw.close();
	}
}

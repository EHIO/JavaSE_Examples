package org.wg.io.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;


public class FileReaderDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	@Test
	public void demo() throws IOException {

		
		//1,������ȡ�ַ����ݵ�������
		/*
		 * �ڴ�����ȡ������ʱ������Ҫ��ȷ����ȡ���ļ���һ��Ҫȷ�����ļ��Ǵ��ڵġ� 
		 * 
		 * ��һ����ȡ������һ���Ѵ����ļ��� 
		 */
		FileReader fr = new FileReader("demo.txt");
		
		int ch = 0;
		
		while((ch=fr.read())!=-1){
			System.out.println((char)ch);
		}
		
		/*
		//��Reader�е�read������ȡ�ַ���
		int ch = fr.read();
		System.out.println((char)ch);
		int ch1 = fr.read();
		System.out.println(ch1);
		int ch2 = fr.read();
		System.out.println(ch2);
		*/
		
		fr.close();
	}

	public void demo2() throws IOException {

		FileReader fr = new FileReader("demo.txt");
		
		/*
		 * ʹ��read(char[])��ȡ�ı��ļ����ݡ�
		 *  
		 * �ȴ����ַ����顣
		 */
		char[] buf = new char[1024];
		
		int len = 0;
		
		while((len=fr.read(buf))!=-1){
			System.out.println(new String(buf,0,len));
		}
		
		/*
		int num = fr.read(buf);//����ȡ�����ַ��洢�������С�
		System.out.println(num+":"+new String(buf,0,num));
		int num1 = fr.read(buf);//����ȡ�����ַ��洢�������С�
		System.out.println(num1+":"+new String(buf,0,num1));
		int num2 = fr.read(buf);//����ȡ�����ַ��洢�������С�
		System.out.println(num2+":"+new String(buf));
		*/
		
		fr.close();
	}
}

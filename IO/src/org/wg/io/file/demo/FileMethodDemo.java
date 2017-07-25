package org.wg.io.file.demo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;


public class FileMethodDemo {
	/**
	 *�������ܣ�
	 *public boolean createNewFile():
	 *	�����ļ� ��������������ļ����Ͳ�������, 
	 *public boolean mkdir():
	 *	�����ļ��� ��������������ļ��У��Ͳ�������
	 *	���Ҫ��ĳ��Ŀ¼�´���Ŀ¼��ǰ��Ҫ��Ŀ¼����
	 *public boolean mkdirs():�����ļ���,������ļ��в����ڣ�����㴴������
	 *
	 *	ע�⣺�㵽��Ҫ�����ļ������ļ��У����������������Ҫ�����ˡ�
	 */
	@Test
	public void create() throws IOException {
		// ������Ҫ��e��Ŀ¼�´���һ���ļ���demo
//		File file = new File("f:\\demo");
//		System.out.println("mkdir:" + file.mkdir());

		// ����:��Ҫ��e��Ŀ¼demo�´���һ���ļ�a.txt
//		File file2 = new File("f:\\demo\\newfile.txt");
//		System.out.println("createNewFile:" + file2.createNewFile());

		// ������Ҫ��e��Ŀ¼test�´���һ���ļ�b.txt
		// Exception in thread "main" java.io.IOException: ϵͳ�Ҳ���ָ����·����
		// ע�⣺Ҫ����ĳ��Ŀ¼�´������ݣ���Ŀ¼���ȱ�����ڡ�
		// File file3 = new File("e:\\test\\b.txt");
		// System.out.println("createNewFile:" + file3.createNewFile());

		// ����:��Ҫ��e��Ŀ¼test�´���aaaĿ¼
//		 File file4 = new File("f:\\test\\aaa");
//		 System.out.println("mkdir:" + file4.mkdir());

		// ��ʵ�����и��򵥵ķ���
//		File file7 = new File("e:\\aaa\\bbb\\ccc\\ddd");
//		System.out.println("mkdirs:" + file7.mkdirs());

		// ����������������
		File file8 = new File("f:\\temp\\a.txt");
		System.out.println("mkdirs:" + file8.mkdirs());
	}
	/**
	 * ɾ������:public boolean delete()
	 * 
	 * ע�⣺
	 * 		A:����㴴���ļ������ļ�������д�̷�·������ô��Ĭ������Ŀ·���¡�
	 * 		B:Java�е�ɾ�����߻���վ��
	 * 		C:Ҫɾ��һ���ļ��У���ע����ļ����ڲ��ܰ����ļ������ļ���
	 * @throws IOException 
	 */
	@Test
	public void delete() throws IOException {
		// �Ҳ�С��д�����������
		File file = new File("a.txt");
		System.out.println("createNewFile:" + file.createNewFile());

		// �����漸��
		File file2 = new File("aaa\\bbb\\ccc");
		System.out.println("mkdirs:" + file2.mkdirs());

		// ɾ�����ܣ���Ҫɾ��a.txt����ļ�
		File file3 = new File("a.txt");
		System.out.println("delete:" + file3.delete());

		// ɾ�����ܣ���Ҫɾ��ccc����ļ���
		File file4 = new File("aaa\\bbb\\ccc");
		System.out.println("delete:" + file4.delete());

		// ɾ�����ܣ���Ҫɾ��aaa�ļ���
		// File file5 = new File("aaa");
		// System.out.println("delete:" + file5.delete());

		File file6 = new File("aaa\\bbb");
		File file7 = new File("aaa");
		System.out.println("delete:" + file6.delete());
		System.out.println("delete:" + file7.delete());
	}
	
	/**
	 * ����������:public boolean renameTo(File dest) 
	 * ���·������ͬ�����Ǹ����� ���·������ͬ�����Ǹ��������С�
	 * 
	 * ·�����̷���ʼ������·�� c:\\a.txt ·�������̷���ʼ�����·�� a.txt
	 */
	@Test
	public void rename() {
		// ����һ���ļ�����
		// File file = new File("����ϼ.jpg");
		// // ������Ҫ�޸�����ļ�������Ϊ"��������.jpg"
		// File newFile = new File("��������.jpg");
		// System.out.println("renameTo:" + file.renameTo(newFile));

		File file2 = new File("��������.jpg");
		File newFile2 = new File("e:\\����ϼ.jpg");
		System.out.println("renameTo:" + file2.renameTo(newFile2));
	}
	
	/**
	 * �жϹ���:
	 * public boolean isDirectory():�ж��Ƿ���Ŀ¼
	 * public boolean isFile():�ж��Ƿ����ļ�
	 * public boolean exists():�ж��Ƿ����
	 * public boolean canRead():�ж��Ƿ�ɶ�
	 * public boolean canWrite():�ж��Ƿ��д
	 * public boolean isHidden():�ж��Ƿ�����
	 */
	@Test
	public void judge() {
		// �����ļ�����
		File file = new File("a.txt");

		System.out.println("exists:" + file.exists());// true
		System.out.println("isDirectory:" + file.isDirectory());// false
		System.out.println("isFile:" + file.isFile());// true
		System.out.println("canRead:" + file.canRead());// true
		System.out.println("canWrite:" + file.canWrite());// true
		System.out.println("isHidden:" + file.isHidden());// false
	}

	/**
	 * ��ȡ���ܣ�
	 * public String getAbsolutePath()����ȡ����·��
	 * public String getPath():��ȡ���·��
	 * public String getName():��ȡ����
	 * public long length():��ȡ���ȡ��ֽ���
	 * public long lastModified():��ȡ���һ�ε��޸�ʱ�䣬����ֵ
	 */
	@Test
	public void get() {
		// �����ļ�����
		File file = new File("demo\\test.txt");

		System.out.println("getAbsolutePath:" + file.getAbsolutePath());
		System.out.println("getPath:" + file.getPath());
		System.out.println("getName:" + file.getName());
		System.out.println("length:" + file.length());
		System.out.println("lastModified:" + file.lastModified());

		// 1416471971031
		Date d = new Date(1416471971031L);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = sdf.format(d);
		System.out.println(s);
	}
	/**
	 * ��ȡ���ܣ�
	 * public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е���������
	 * public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ��е�File����
	 */
	public static void get2() {
		// ָ��һ��Ŀ¼
		File file = new File("e:\\");

		// public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е���������
		String[] strArray = file.list();
		for (String s : strArray) {
			System.out.println(s);
		}
		System.out.println("------------");

		// public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ��е�File����
		File[] fileArray = file.listFiles();
		for (File f : fileArray) {
			System.out.println(f.getName());
		}
	}
}

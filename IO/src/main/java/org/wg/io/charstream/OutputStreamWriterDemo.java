package org.wg.io.charstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * OutputStreamWriter 是字符流通向字节流的桥梁
 * OutputStreamWriter(OutputStream out):根据默认编码把字节流的数据转换为字符流
 * OutputStreamWriter(OutputStream out,String charsetName):
 * 字符流 = 字节流 +编码表。
 */
public class OutputStreamWriterDemo {

	public void demo() throws IOException {
		// 创建对象
		// OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
		// "osw.txt")); // 默认GBK
		// OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
		// "osw.txt"), "GBK"); // 指定GBK
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
				"f:temp/fos.txt"), "UTF-8"); // 指定UTF-8
		// 写数据
		osw.write("中国");

		// 释放资源
		osw.close();
	}

	public void demo2() throws IOException {
		// 创建对象
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
				"osw2.txt"));

		// 写数据
		// public void write(int c):写一个字符
		// osw.write('a');
		// osw.write(97);
		// 为什么数据没有进去呢?
		// 原因是：字符 = 2字节
		// 文件中数据存储的基本单位是字节。
		// void flush()

		// public void write(char[] cbuf):写一个字符数组
		// char[] chs = {'a','b','c','d','e'};
		// osw.write(chs);

		// public void write(char[] cbuf,int off,int len):写一个字符数组的一部分
		// osw.write(chs,1,3);

		// public void write(String str):写一个字符串
		// osw.write("我爱林青霞");

		// public void write(String str,int off,int len):写一个字符串的一部分
		osw.write("我爱林青霞", 2, 3);

		// 刷新缓冲区
		osw.flush();
		// osw.write("我爱林青霞", 2, 3);

		// 释放资源
		osw.close();
	}
}

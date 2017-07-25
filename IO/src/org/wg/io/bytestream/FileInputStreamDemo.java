package org.wg.io.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class FileInputStreamDemo {

	/**
	 * int read():一次读取一个字节
	 */
	@Test
	public void demo() throws IOException {
		FileInputStream fis = new FileInputStream("f:temp/fos.txt");

		// 最终版代码
		int by = 0;
		// 读取，赋值，判断
		while ((by = fis.read()) != -1) {
			System.out.print((char) by);
		}

		// 释放资源
		fis.close();
	}
	/**
	 * 一次读取一个字节数组：int read(byte[] b)
	 * 返回值其实是实际读取的字节个数。
	 * @throws IOException
	 */
	@Test
	public void demo2() throws IOException {
		FileInputStream fis = new FileInputStream("f:temp/fos.txt");

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			System.out.print(new String(bys, 0, len));
		}

		// 释放资源
		fis.close();
	}
}

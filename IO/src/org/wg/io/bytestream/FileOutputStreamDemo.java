package org.wg.io.bytestream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

/*
 * IO流的分类：
 * 		流向：
 * 			输入流	读取数据
 * 			输出流 写出数据
 * 		数据类型：
 * 			字节流
 * 				字节输入流	读取数据	InputStream
 * 				字节输出流	写出数据	OutputStream
 * 			字符流
 * 				字符输入流	读取数据	Reader
 * 				字符输出流	写出数据	Writer
 * 
 * 		注意：一般我们在探讨IO流的时候，如果没有明确说明按哪种分类来说，默认情况下是按照数据类型来分的。
 * 
 * 查看FileOutputStream的构造方法：
 * 		FileOutputStream(File file) 
 *		FileOutputStream(String name)
 *
 * 字节输出流操作步骤：
 * 		A:创建字节输出流对象
 * 		B:写数据
 * 		C:释放资源
 */
public class FileOutputStreamDemo {

	@Test
	public void demo() throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream("f:temp/fos.txt");
		/*
		 * 创建字节输出流对象了做了几件事情：
		 * A:调用系统功能去创建文件
		 * B:创建fos对象
		 * C:把fos对象指向这个文件
		 */
		
		//写数据
		fos.write("hello,IO".getBytes());
		fos.write("java".getBytes());
		
		//释放资源
		//关闭此文件输出流并释放与此流有关的所有系统资源。
		fos.close();
		/*
		 * 为什么一定要close()呢?
		 * A:让流对象变成垃圾，这样就可以被垃圾回收器回收了
		 * B:通知系统去释放跟该文件相关的资源
		 */
		//java.io.IOException: Stream Closed
		//fos.write("java".getBytes());
	}
	
	/**
	 * public void write(int b):写一个字节
	 * public void write(byte[] b):写一个字节数组
	 * public void write(byte[] b,int off,int len):写一个字节数组的一部分
	 */
	@Test
	public void demo2() throws IOException {
		// 创建字节输出流对象
		// OutputStream os = new FileOutputStream("fos2.txt"); // 多态
		FileOutputStream fos = new FileOutputStream("f:temp/fos.txt");

		// 调用write()方法
		//fos.write(97); //97 -- 底层二进制数据	-- 通过记事本打开 -- 找97对应的字符值 -- a
		// fos.write(57);
		// fos.write(55);
		
		//public void write(byte[] b):写一个字节数组
		byte[] bys={97,98,99,100,101};
//		fos.write(bys);
		
		//public void write(byte[] b,int off,int len):写一个字节数组的一部分
		fos.write(bys,1,3);
		
		//释放资源
		fos.close();
	}
	
	/**
	 * 如何实现数据的换行?
	 * 		为什么现在没有换行呢?因为你值写了字节数据，并没有写入换行符号。
	 * 		如何实现呢?写入换行符号即可呗。
	 * 		刚才我们看到了有写文本文件打开是可以的，通过windows自带的那个不行，为什么呢?
	 * 		因为不同的系统针对不同的换行符号识别是不一样的?
	 * 		windows:\r\n
	 * 		linux:\n
	 * 		Mac:\r
	 * 		而一些常见的个高级记事本，是可以识别任意换行符号的。
	 * 
	 * 如何实现数据的追加写入?
	 * 		用构造方法带第二个参数是true的情况即可
	 * @throws IOException 
	 */
	@Test
	public void demo3() throws IOException {
		/*
			 创建一个向具有指定 name 的文件中写入数据的输出文件流。
			如果第二个参数为 true，则将字节写入文件末尾处，而不是写入文件开始处。
		*/
		FileOutputStream fos = new FileOutputStream("F:temp/fos.txt", true);

		// 写数据
		for (int x = 0; x < 10; x++) {
			fos.write(("hello" + x).getBytes());
			fos.write("\r\n".getBytes());
		}

		// 释放资源
		fos.close();
	}
	
	/*
	 * 加入异常处理的字节输出流操作
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
			// 如果fos不是null，才需要close()
			if (fos != null) {
				// 为了保证close()一定会执行，就放到这里了
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

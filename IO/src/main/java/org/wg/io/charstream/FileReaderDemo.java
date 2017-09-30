package org.wg.io.charstream;

import java.io.FileReader;
import java.io.IOException;


public class FileReaderDemo {

    /**
     * @param args
     * @throws IOException
     */

    public void demo() throws IOException {


        //1,创建读取字符数据的流对象。
        /*
         * 在创建读取流对象时，必须要明确被读取的文件。一定要确定该文件是存在的。
		 *
		 * 用一个读取流关联一个已存在文件。
		 */
        FileReader fr = new FileReader("demo.txt");

        int ch = 0;

        while ((ch = fr.read()) != -1) {
            System.out.println((char) ch);
        }

		/*
		//用Reader中的read方法读取字符。
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
		 * 使用read(char[])读取文本文件数据。
		 *
		 * 先创建字符数组。
		 */
        char[] buf = new char[1024];

        int len = 0;

        while ((len = fr.read(buf)) != -1) {
            System.out.println(new String(buf, 0, len));
        }

		/*
		int num = fr.read(buf);//将读取到的字符存储到数组中。
		System.out.println(num+":"+new String(buf,0,num));
		int num1 = fr.read(buf);//将读取到的字符存储到数组中。
		System.out.println(num1+":"+new String(buf,0,num1));
		int num2 = fr.read(buf);//将读取到的字符存储到数组中。
		System.out.println(num2+":"+new String(buf));
		*/

        fr.close();
    }
}

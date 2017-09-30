package org.wg.io.bytestream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
	public static void main(String[] args) throws IOException {
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("bos.txt"));

		byte[] bys = new byte[1024];
		int len;
		while ((len = bis.read(bys)) != -1) {
			System.out.print(new String(bys, 0, len));
		}


		bis.close();
	}
}

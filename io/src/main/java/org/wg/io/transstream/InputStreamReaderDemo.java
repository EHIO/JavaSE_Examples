package org.wg.io.transstream;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * InputStreamReader: 字符流
 * 作用：字节流通向字符流的桥梁
 */
public class InputStreamReaderDemo {

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(new FileInputStream("fos.txt"), "UTF-8");

        int ch = 0;
        while ((ch = isr.read()) != -1) {
            System.out.print((char) ch);
        }

        isr.close();
    }

    @Test
    public void demo() throws IOException {

        InputStreamReader isr = new InputStreamReader(new FileInputStream("osw.txt"));

        char[] chs = new char[1024];
        int len = 0;
        while ((len = isr.read(chs)) != -1) {
            System.out.print(new String(chs, 0, len));
        }
        isr.close();
    }
}

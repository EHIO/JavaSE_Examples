package org.wg.io.charstream;

import java.io.FileReader;
import java.io.IOException;


public class MyBufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        MyBufferedReader mbr = new MyBufferedReader(new FileReader("demo.txt"));

        String line = null;
        while ((line = mbr.readLine()) != null) {
            System.out.println(line);
        }
        mbr.close();

        // System.out.println('\r' + 0); // 13
        // System.out.println('\n' + 0);// 10
    }
}

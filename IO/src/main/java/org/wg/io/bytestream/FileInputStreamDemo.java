package org.wg.io.bytestream;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

    @Test
    public void demo() throws IOException {
        FileInputStream fis = new FileInputStream("fos.txt");

        int by;
        while ((by = fis.read()) != -1) {
            System.out.print((char) by);
        }

        fis.close();
    }


    @Test
    public void demo2() throws IOException {
        FileInputStream fis = new FileInputStream("fos.txt");

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = fis.read(bys)) != -1) {
            System.out.print(new String(bys, 0, len));
        }
        fis.close();
    }
}

package org.wg.io.bytestream;

import org.junit.Test;

import java.io.*;

public class CopyTest {

    @Test
    public void copy_4() throws IOException {
        FileInputStream fis = new FileInputStream("fis.txt");
        FileOutputStream fos = new FileOutputStream("fos.txt");

        int ch = 0;

        while ((ch = fis.read()) != -1) {
            fos.write(ch);
        }

        fos.close();
        fis.close();
    }


    /**
     * @throws IOException
     */
    @Test
    public void copy_3() throws IOException {
        FileInputStream fis = new FileInputStream("fis.txt");
        FileOutputStream fos = new FileOutputStream("fos.txt");

        byte[] buf = new byte[fis.available()];
        fis.read(buf);
        System.out.println(new String(buf));
        fos.write(buf);
        fos.close();
        fis.close();
    }

    @Test
    public void copy_2() throws IOException {

        FileInputStream fis = new FileInputStream("fis.txt");
        BufferedInputStream bufis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("fos.txt");
        BufferedOutputStream bufos = new BufferedOutputStream(fos);

        int ch = 0;

        while ((ch = bufis.read()) != -1) {
            bufos.write(ch);
        }

        bufos.close();
        bufis.close();
    }

    @Test
    public void copy_1() throws IOException {

        FileInputStream fis = new FileInputStream("fis.txt");
        FileOutputStream fos = new FileOutputStream("fos.txt");

        byte[] buf = new byte[1024];

        int len = 0;

        while ((len = fis.read(buf)) != -1) {
            fos.write(buf, 0, len);
        }

        fos.close();
        fis.close();
    }


    @Test
    public void method5() throws IOException {
        FileInputStream fis = new FileInputStream("fis.txt");
        BufferedInputStream bufis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("fox.txt");
        BufferedOutputStream bufos = new BufferedOutputStream(fos);

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = bufis.read(bys)) != -1) {
            bufos.write(bys, 0, len);
        }

        bufis.close();
        bufis.close();
    }
}

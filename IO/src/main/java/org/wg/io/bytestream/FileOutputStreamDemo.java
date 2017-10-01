package org.wg.io.bytestream;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

    @Test
    public void demo() throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt");

        fos.write("hello,IO".getBytes());
        fos.write("java".getBytes());

        fos.close();

        //fos.write("java".getBytes());
    }

    @Test
    public void demo2() throws IOException {

        FileOutputStream fos = new FileOutputStream("fos.txt");


        byte[] bys = {97, 98, 99, 100, 101};

        fos.write(bys, 1, 3);


        fos.close();
    }


    @Test
    public void demo3() throws IOException {

        FileOutputStream fos = new FileOutputStream("fos.txt", true);


        for (int x = 0; x < 10; x++) {
            fos.write(("hello" + x).getBytes());
            fos.write("\r\n".getBytes());
        }

        fos.close();
    }


    @Test
    public void demo4() {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("fos.txt");
            fos.write("java".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
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

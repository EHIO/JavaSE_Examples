package org.wg.io.bytestream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        try {
            bis = new BufferedInputStream(new FileInputStream("bos.txt"));
            byte[] bys = new byte[1024];
            int len;
            while ((len = bis.read(bys)) != -1) {
                System.out.print(new String(bys, 0, len));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                    bis = null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

package org.wg.io.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class FileInputStreamDemo {

    /**
     * int read():һ�ζ�ȡһ���ֽ�
     */
    @Test
    public void demo() throws IOException {
        FileInputStream fis = new FileInputStream("f:temp/fos.txt");

        // ���հ����
        int by;
        // ��ȡ����ֵ���ж�
        while ((by = fis.read()) != -1) {
            System.out.print((char) by);
        }

        // �ͷ���Դ
        fis.close();
    }

    /**
     * һ�ζ�ȡһ���ֽ����飺int read(byte[] b)
     * ����ֵ��ʵ��ʵ�ʶ�ȡ���ֽڸ�����
     *
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

        // �ͷ���Դ
        fis.close();
    }
}

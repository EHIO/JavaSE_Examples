package org.wg.io.charstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufr = new BufferedReader(new FileReader("buf.txt"));
        String line;
        while ((line = bufr.readLine()) != null) {
            System.out.println(line);
        }
        bufr.close();
    }
}

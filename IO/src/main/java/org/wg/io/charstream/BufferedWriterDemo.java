package org.wg.io.charstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        BufferedWriter bufw = new BufferedWriter(new FileWriter("buf.txt"));

        for (int x = 1; x <= 4; x++) {
            bufw.write("abcdef" + x);
            bufw.newLine();
            bufw.flush();
        }
        bufw.close();
    }
}

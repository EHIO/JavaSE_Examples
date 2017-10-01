package org.wg.io.charstream;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderDemo {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("demo.txt");
        LineNumberReader lnr = new LineNumberReader(fr);

        String line = null;
        lnr.setLineNumber(0);
        while ((line = lnr.readLine()) != null) {
            System.out.println(lnr.getLineNumber() + ":" + line);
        }
        lnr.close();
    }
}
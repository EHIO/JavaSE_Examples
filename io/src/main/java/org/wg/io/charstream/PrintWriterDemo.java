package org.wg.io.charstream;

import java.io.*;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {

        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));

        PrintWriter out = new PrintWriter(new FileWriter("out.txt"), true);

        String line = null;
        while ((line = bufr.readLine()) != null) {
            if ("over".equals(line))
                break;
            out.println(line.toUpperCase());
            out.flush();
        }

        out.close();
        bufr.close();
    }

}

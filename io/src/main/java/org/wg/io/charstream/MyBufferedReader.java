package org.wg.io.charstream;

import java.io.IOException;
import java.io.Reader;

public class MyBufferedReader {
    private Reader r;

    public MyBufferedReader(Reader r) {
        this.r = r;
    }


    public String readLine() throws IOException {

        StringBuilder sb = new StringBuilder();

		/*
        hello
		world
		java	
		
		104101108108111
		119111114108100
		1069711897
		 */

        int ch = 0;
        while ((ch = r.read()) != -1) { //104,101,108,108,111
            if (ch == '\r') {
                continue;
            }
            if (ch == '\n') {
                return sb.toString(); //hello
            } else {
                sb.append((char) ch); //hello
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public void close() throws IOException {
        this.r.close();
    }
}

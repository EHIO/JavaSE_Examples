package org.wg.io.transstream;

import java.io.*;

public class ReadKey {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

//		readKey();
//		System.out.println((int)'\r');
//		System.out.println((int)'\n');

        readKey2();

    }

    public static void readKey2() throws IOException {

        StringBuilder sb = new StringBuilder();

        InputStream in = System.in;

        int ch = 0;

        while ((ch = in.read()) != -1) {
            if (ch == '\r')
                continue;
            if (ch == '\n') {
                String temp = sb.toString();
                if ("over".equals(temp))
                    break;
                System.out.println(temp.toUpperCase());
                sb.delete(0, sb.length());
            } else {
                sb.append((char) ch);
            }
        }
    }

    public static void readKey3(String[] args) throws IOException {

        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = null;

        while ((line = bufr.readLine()) != null) {
            if ("over".equals(line)) {
                break;
            }
            bufw.write(line.toUpperCase());
            bufw.newLine();
            bufw.flush();
        }
    }

    public static void readKey() throws IOException {

        InputStream in = System.in;

        int ch = in.read();//����ʽ������
        System.out.println(ch);
        int ch1 = in.read();//����ʽ������
        System.out.println(ch1);
        int ch2 = in.read();//����ʽ������
        System.out.println(ch2);
    }


}

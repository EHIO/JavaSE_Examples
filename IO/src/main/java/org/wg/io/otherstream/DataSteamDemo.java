package org.wg.io.otherstream;

import java.io.*;

public class DataSteamDemo {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

//		writeData();
        readData();

    }

    public static void readData() throws IOException {

        DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));

        String str = dis.readUTF();

        System.out.println(str);
    }

    public static void writeData() throws IOException {

        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));

        dos.writeUTF("���");

        dos.close();


    }

}

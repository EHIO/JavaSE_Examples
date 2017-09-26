package org.wg.io.file.test;

import java.io.File;

public class RemoveDirTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        File dir = new File("e:\\demodir");
        removeDir(dir);
    }

    public static void removeDir(File dir) {

        File[] files = dir.listFiles();

        for (File file : files) {
            if (file.isDirectory()) {
                removeDir(file);
            } else {
                System.out.println(file + ":" + file.delete());
            }
        }
        System.out.println(dir + ":" + dir.delete());
    }

}
package org.wg.io.file.test;

import java.io.File;
/*
 * ���󣺶�ָ��Ŀ¼�����������ݵ��г���������Ŀ¼�е����ݣ�
 * Ҳ�������Ϊ ��ȱ�����
 * 
 * 
 */

public class FileTest4 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        File dir = new File("f:\\temp");

        listAll(dir, 0);
    }

    public static void listAll(File dir, int level) {


        System.out.println(getSpace(level) + dir.getName());
        //��ȡָ��Ŀ¼�µ�ǰ�������ļ��л����ļ�����

        level++;
        File[] files = dir.listFiles();

        for (int x = 0; x < files.length; x++) {

            if (files[x].isDirectory()) {
                listAll(files[x], level);
            } else
                System.out.println(getSpace(level) + files[x].getName());
        }
    }

    private static String getSpace(int level) {

        StringBuilder sb = new StringBuilder();

        sb.append("|--");
        for (int x = 0; x < level; x++) {
            sb.insert(0, "|  ");
        }

        return sb.toString();
    }


}

package org.wg.io.file.test;

import java.io.File;
import java.io.FilenameFilter;

/*
 * �ж�E��Ŀ¼���Ƿ��к�׺��Ϊ.jpg���ļ�������У���������ļ�����
 * A:�Ȼ�ȡ���еģ�Ȼ�������ʱ�������жϣ�������������������
 * B:��ȡ��ʱ����Ѿ��������������ˣ�Ȼ��������ɡ�
 * 
 * Ҫ��ʵ�����Ч�����ͱ���ѧϰһ���ӿڣ��ļ����ƹ�����
 * public String[] list(FilenameFilter filter)
 * public File[] listFiles(FilenameFilter filter)
 */
public class FileTest2 {
    public static void main(String[] args) {
        // ��װe�ж�Ŀ¼
        File file = new File("e:\\");

        // ��ȡ��Ŀ¼�������ļ������ļ��е�String����
        // public String[] list(FilenameFilter filter)
        String[] strArray = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                // return false;
                // return true;
                // ͨ��������ԣ����Ǿ�֪���ˣ����װ�����ļ������ļ��е����ƼӲ��ӵ������У�ȡ��������ķ���ֵ��true����false
                // ���ԣ������true����falseӦ��������ͨ��ĳ���жϵõ���
                // System.out.println(dir + "---" + name);
                // File file = new File(dir, name);
                // // System.out.println(file);
                // boolean flag = file.isFile();
                // boolean flag2 = name.endsWith(".jpg");
                // return flag && flag2;
                return new File(dir, name).isFile() && name.endsWith(".jpg");
            }
        });

        // ����
        for (String s : strArray) {
            System.out.println(s);
        }
    }
}
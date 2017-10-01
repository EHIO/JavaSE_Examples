package org.wg.io.file.test;

import java.io.File;

/*
 * �ж�E��Ŀ¼���Ƿ��к�׺��Ϊ.jpg���ļ�������У���������ļ�����
 * 
 * ������
 * 		A:��װe�ж�Ŀ¼
 * 		B:��ȡ��Ŀ¼�������ļ������ļ��е�File����
 * 		C:������File���飬�õ�ÿһ��File����Ȼ���ж�
 * 		D:�Ƿ����ļ�
 * 			�ǣ������ж��Ƿ���.jpg��β
 * 				�ǣ���������ļ�����
 * 				�񣺲�������
 * 			�񣺲�������
 */
public class FileTest {
    public static void main(String[] args) {
        // ��װe�ж�Ŀ¼
        File file = new File("e:\\");

        // ��ȡ��Ŀ¼�������ļ������ļ��е�File����
        File[] fileArray = file.listFiles();

        // ������File���飬�õ�ÿһ��File����Ȼ���ж�
        for (File f : fileArray) {
            // �Ƿ����ļ�
            if (f.isFile()) {
                // �����ж��Ƿ���.jpg��β
                if (f.getName().endsWith(".jpg")) {
                    // ��������ļ�����
                    System.out.println(f.getName());
                }
            }
        }
    }
}

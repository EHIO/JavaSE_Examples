package org.wg.io.file.test;

import java.io.File;

/*
 * ���󣺰�E:\����\���������������Ƶ�����޸�Ϊ
 * 		00?_����.avi
 * 
 * ˼·��
 * 		A:��װĿ¼
 * 		B:��ȡ��Ŀ¼�����е��ļ���File����
 * 		C:������File���飬�õ�ÿһ��File����
 * 		D:ƴ��һ���µ����ƣ�Ȼ�����������ɡ�
 */
public class FileTest3 {
    public static void main(String[] args) {
        // ��װĿ¼
        File srcFolder = new File("E:\\����\\��������");

        // ��ȡ��Ŀ¼�����е��ļ���File����
        File[] fileArray = srcFolder.listFiles();

        // ������File���飬�õ�ÿһ��File����
        for (File file : fileArray) {
            // System.out.println(file);
            // E:\����\��������\��������_001_[������-����ܸ���,�����IO��]_��԰������.avi
            // �ĺ�E:\����\��������\001_��԰������.avi
            String name = file.getName(); // ��������_001_[������-����ܸ���,�����IO��]_��԰������.avi

            int index = name.indexOf("_");
            String numberString = name.substring(index + 1, index + 4);
            // System.out.println(numberString);

            // int startIndex = name.lastIndexOf('_');
            // int endIndex = name.lastIndexOf('.');
            // String nameString = name.substring(startIndex + 1, endIndex);
            // System.out.println(nameString);
            int endIndex = name.lastIndexOf('_');
            String nameString = name.substring(endIndex);

            String newName = numberString.concat(nameString); // 001_��԰������.avi
            // System.out.println(newName);

            File newFile = new File(srcFolder, newName); // E:\\����\\��������\\001_��԰������.avi

            // ����������
            file.renameTo(newFile);
        }
    }
}

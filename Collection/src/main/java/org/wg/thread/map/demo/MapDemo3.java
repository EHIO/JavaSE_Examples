package org.wg.thread.map.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map���ϵı�����
 * Map -- ���޶�
 * ˼·��
 * 		A:�����е��ɷ������������
 * 		B:�����ɷ�ļ��ϣ���ȡ�õ�ÿһ���ɷ�
 * 		C:���ɷ�ȥ���Լ������ӡ�
 * 
 * ת����
 * 		A:��ȡ���еļ�
 * 		B:�������ļ��ϣ���ȡ�õ�ÿһ����
 * 		C:���ݼ�ȥ��ֵ
 */
public class MapDemo3 {
    public static void main(String[] args) {
        // �������϶���
        Map<String, String> map = new HashMap<String, String>();

        // ����Ԫ�ز���ӵ�����
        map.put("���", "С��Ů");
        map.put("����", "����");
        map.put("�", "�����");
        map.put("������", "÷����");

        // ����
        // ��ȡ���еļ�
        Set<String> set = map.keySet();
        // �������ļ��ϣ���ȡ�õ�ÿһ����
        for (String key : set) {
            // ���ݼ�ȥ��ֵ
            String value = map.get(key);
            System.out.println(key + "---" + value);
        }
    }
}
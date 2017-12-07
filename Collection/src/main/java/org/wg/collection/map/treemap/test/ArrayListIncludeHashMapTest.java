package org.wg.collection.map.treemap.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 ArrayList����Ƕ��HashMap���ϲ�������
 ����
 ����ArrayList���ϵ�Ԫ����HashMap����3����
 ÿһ��HashMap���ϵļ���ֵ�����ַ�����
 Ԫ�����Ѿ���ɣ��������
 �����
 ���---С��
 ����---����

 ����---����
 ���---С��Ů

 �����---��ӯӯ
 ��ƽ֮---����ɺ
 */
public class ArrayListIncludeHashMapTest {
    public static void main(String[] args) {
        // �������϶���
        ArrayList<HashMap<String, String>> array = new ArrayList<HashMap<String, String>>();

        // ����Ԫ��1
        HashMap<String, String> hm1 = new HashMap<String, String>();
        hm1.put("���", "С��");
        hm1.put("����", "����");
        // ��Ԫ����ӵ�array����
        array.add(hm1);

        // ����Ԫ��1
        HashMap<String, String> hm2 = new HashMap<String, String>();
        hm2.put("����", "����");
        hm2.put("���", "С��Ů");
        // ��Ԫ����ӵ�array����
        array.add(hm2);

        // ����Ԫ��1
        HashMap<String, String> hm3 = new HashMap<String, String>();
        hm3.put("�����", "��ӯӯ");
        hm3.put("��ƽ֮", "����ɺ");
        // ��Ԫ����ӵ�array����
        array.add(hm3);

        // ����
        for (HashMap<String, String> hm : array) {
            Set<String> set = hm.keySet();
            for (String key : set) {
                String value = hm.get(key);
                System.out.println(key + "---" + value);
            }
        }
    }
}

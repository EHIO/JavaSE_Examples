package org.wg.collection.map.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * ��ȡ���ܣ�
 * V get(Object key):���ݼ���ȡֵ
 * Set<K> keySet():��ȡ���������м��ļ���
 * Collection<V> values():��ȡ����������ֵ�ļ���
 */
public class MapDemo2 {
    public static void main(String[] args) {
        // �������϶���
        Map<String, String> map = new HashMap<String, String>();

        // ����Ԫ�ز����Ԫ��
        map.put("�˳�", "��ٳ");
        map.put("������", "��ӱ");
        map.put("�ܽ���", "������");
        map.put("������", "����");

        // V get(Object key):���ݼ���ȡֵ
        System.out.println("get:" + map.get("�ܽ���"));
        System.out.println("get:" + map.get("�ܽ�")); // ����null
        System.out.println("----------------------");

        // Set<K> keySet():��ȡ���������м��ļ���
        Set<String> set = map.keySet();
        for (String key : set) {
            System.out.println(key);
        }
        System.out.println("----------------------");

        // Collection<V> values():��ȡ����������ֵ�ļ���
        Collection<String> con = map.values();
        for (String value : con) {
            System.out.println(value);
        }
    }
}

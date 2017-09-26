package org.wg.map.treemap.test;

import java.util.HashMap;
import java.util.Set;

/*
 * HashMapǶ��HashMap
 * 
 * ���ǲ���
 * 		jc	������
 * 				����¥		20
 * 				��Ծ		22
 * 		jy	��ҵ��
 * 				���		21
 * 				��ʯ��		23
 * 
 * �ȴ洢Ԫ�أ�Ȼ�����Ԫ��
 */
public class HashMapTest2 {
    public static void main(String[] args) {
        // �������϶���
        HashMap<String, HashMap<String, Integer>> czbkMap = new HashMap<String, HashMap<String, Integer>>();

        // ���������༯�϶���
        HashMap<String, Integer> jcMap = new HashMap<String, Integer>();
        // ���Ԫ��
        jcMap.put("����¥", 20);
        jcMap.put("��Ծ", 22);
        // �ѻ�������ӵ��󼯺�
        czbkMap.put("jc", jcMap);

        // ������ҵ�༯�϶���
        HashMap<String, Integer> jyMap = new HashMap<String, Integer>();
        // ���Ԫ��
        jyMap.put("���", 21);
        jyMap.put("��ʯ��", 23);
        // �ѻ�������ӵ��󼯺�
        czbkMap.put("jy", jyMap);

        //��������
        Set<String> czbkMapSet = czbkMap.keySet();
        for (String czbkMapKey : czbkMapSet) {
            System.out.println(czbkMapKey);
            HashMap<String, Integer> czbkMapValue = czbkMap.get(czbkMapKey);
            Set<String> czbkMapValueSet = czbkMapValue.keySet();
            for (String czbkMapValueKey : czbkMapValueSet) {
                Integer czbkMapValueValue = czbkMapValue.get(czbkMapValueKey);
                System.out.println("\t" + czbkMapValueKey + "---" + czbkMapValueValue);
            }
        }
    }
}

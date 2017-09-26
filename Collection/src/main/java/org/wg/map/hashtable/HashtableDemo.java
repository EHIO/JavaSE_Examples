package org.wg.map.hashtable;

import java.util.Hashtable;

/*
 * 1:Hashtable��HashMap������?
 * Hashtable:�̰߳�ȫ��Ч�ʵ͡�������null����nullֵ
 * HashMap:�̲߳���ȫ��Ч�ʸߡ�����null����nullֵ
 * 
 * 2:List,Set,Map�Ƚӿ��Ƿ񶼼̳���Map�ӿ�?
 * List��Set���Ǽ̳���Map�ӿڣ����Ǽ̳���Collection�ӿ�
 * Map�ӿڱ������һ������ӿ�
 */
public class HashtableDemo {
    public static void main(String[] args) {
        // HashMap<String, String> hm = new HashMap<String, String>();
        Hashtable<String, String> hm = new Hashtable<String, String>();

        hm.put("it001", "hello");
        // hm.put(null, "world"); //NullPointerException
        // hm.put("java", null); // NullPointerException

        System.out.println(hm);
    }
}
package org.wg.thread.set;

import java.util.HashSet;
import java.util.Set;

/*
 * Collection
 * 		|--List
 * 			����(�洢˳���ȡ��˳��һ��),���ظ�
 * 		|--Set
 * 			����(�洢˳���ȡ��˳��һ��),Ψһ
 * 
 * HashSet��������֤ set �ĵ���˳���ر���������֤��˳���ò��䡣
 * ע�⣺��ȻSet���ϵ�Ԫ�����򣬵��ǣ���Ϊ������˵�����϶������Լ��Ĵ洢˳��
 * �����˳��ǡ�ú����Ĵ洢˳��һ�£����������������Զ�洢һЩ���ݣ����ܿ���Ч����
 */
public class SetDemo {
    public static void main(String[] args) {
        // �������϶���
        Set<String> set = new HashSet<String>();

        // ���������Ԫ��
        set.add("hello");
        set.add("java");
        set.add("world");
        set.add("java");
        set.add("world");

        // ��ǿfor
        for (String s : set) {
            System.out.println(s);
        }
        hashCodes();
    }

    public static void hashCodes() {
        println("hello".hashCode());
        println("hello".hashCode());
        println("world".hashCode());
        println("java".hashCode());
    }

    public static <T> void println(T t) {
        System.out.println(t);
    }
}

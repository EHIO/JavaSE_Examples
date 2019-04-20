package org.wg.io.otherstream.objectstream;

import org.wg.io.otherstream.bean.Person;

import java.io.*;

public class ObjectStreamDemo {

    /**
     * @param args
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//		writeObj();
        readObj();
    }

    public static void readObj() throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.object"));
        //����ķ����л���
        Person p = (Person) ois.readObject();

        System.out.println(p.getName() + ":" + p.getAge());

        ois.close();

    }

    public static void writeObj() throws IOException, IOException {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.object"));
        //�������л���  �����л��Ķ������ʵ��Serializable�ӿڡ�
        oos.writeObject(new Person("Сǿ", 30));

        oos.close();


    }

}

package org.wg.io.charstream;

import java.util.ArrayList;

/**
 * Created by win7 on 2017/10/1.
 */
public class Ttes {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();

        al.add("haha");
        al.add("abc");
        al.add("abc");
        al.add("abc");

//		int size = al.size();

        for (int x = 0; x < al.size(); x++) {
            if ("abc".equals(al.get(x))) {
                al.remove(x);
                x--;
            }
        }

        System.out.println(al);
    }
}

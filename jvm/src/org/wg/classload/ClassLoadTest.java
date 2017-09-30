package org.wg.classload;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by run on 2017/9/8.
 */
public class ClassLoadTest {

    public static void main(String[] args) throws Exception {
        final ClassLoader classLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try {
                    String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
                    InputStream is = getClass().getResourceAsStream(fileName);
                    if (is == null) {
                        return super.loadClass(name);
                    }

                    byte[] b = new byte[is.available()];
                    is.read(b);
                    return defineClass(name, b, 0, b.length);
                } catch (IOException e) {
                    throw new ClassNotFoundException();
                }
            }
        };
        // 使用自定义加载器加载
        Object obj = classLoader.loadClass("org.wg.classload.ClassLoadTest").newInstance();
        System.out.println(obj.getClass());
        System.out.println(obj instanceof org.wg.classload.ClassLoadTest);

        // 使用系统类加载器加载
        Object obj2 = ClassLoadTest.class.getClassLoader().loadClass("org.wg.classload.ClassLoadTest").newInstance();
        System.err.println(obj2.getClass());
        System.err.println(obj2 instanceof org.wg.classload.ClassLoadTest);
    }
}

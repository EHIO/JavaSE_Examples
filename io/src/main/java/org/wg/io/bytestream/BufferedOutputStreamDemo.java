package org.wg.io.bytestream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 写数据：BufferedOutputStream
 * 读数据：BufferedInputStream
 *
 * 构造方法可以指定缓冲区的大小，但是我们一般用不上，因为默认缓冲区大小就足够了。
 *
 * 为什么不传递一个具体的文件或者文件路径，而是传递一个OutputStream对象呢?
 * 原因很简单，字节缓冲区流仅仅提供缓冲区，为高效而设计的。但是呢，真正的读写操作还得靠基本的流对象实现。
 */
public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("bos.txt"));

        // 写数据
        bos.write("hello".getBytes());

        // 释放资源
        bos.close();
    }
}

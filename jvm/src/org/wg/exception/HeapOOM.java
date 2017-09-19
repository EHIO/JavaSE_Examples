package org.wg.exception;

import java.util.ArrayList;
import java.util.List;

/**
 * java堆内存溢出异常测试
 *
 * 虚拟机设置参数： -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * 限制java堆的大小为20M，不可扩展(将堆的最小值-Xms和最大值-Xmx参数设置为一样可避免自动扩展)
 * 通过参数-XX:+HeapDumpOnOutOfMemoryError可以让虚拟机出现内存溢出异常时Dump(倾销)出当前的内存堆转储快照以便事后进行分析
 */
public class HeapOOM {

    static class OOMObject {
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}

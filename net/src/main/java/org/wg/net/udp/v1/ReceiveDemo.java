package org.wg.net.udp.v1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
/*
 * UDP协议接收数据：
	A:创建接收端Socket对象
	B:创建一个数据包(接收容器)
	C:调用Socket对象的接收方法接收数据
	D:解析数据包，并显示在控制台
	E:释放资源
 * 多次启动接收端：
 * 		java.net.BindException: Address already in use: Cannot bind
 * 		端口被占用。
 */
public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		// 创建接收端的Socket对象
		DatagramSocket ds = new DatagramSocket(12345);

		// 创建一个包裹
		byte[] bys = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bys, bys.length);

		// 接收数据
		ds.receive(dp);

		// 解析数据
		String ip = dp.getAddress().getHostAddress();
		int port = dp.getPort();
		String s = new String(dp.getData(), 0, dp.getLength());
		System.out.println("from " + ip + port + " data is : " + s);

		// 释放资源
		ds.close();
	}
}

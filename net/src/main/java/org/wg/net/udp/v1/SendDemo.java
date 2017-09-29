package org.wg.net.udp.v1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
/*
 * UDP协议发送数据：
	A:创建发送端Socket对象
	B:创建数据，并把数据打包
	C:调用Socket对象的发送方法发送数据包
	D:释放资源
 */
public class SendDemo {
	public static void main(String[] args) throws IOException {
		// 创建发送端的Socket对象
		DatagramSocket ds = new DatagramSocket();

		// 创建数据并打包
		byte[] bys = "hello world".getBytes();
		DatagramPacket dp = new DatagramPacket(bys, bys.length,
				InetAddress.getByName("127.0.0.1"), 12345);

		// 发送数据
		ds.send(dp);

		// 释放资源
		ds.close();
	}
}

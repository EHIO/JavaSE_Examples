package org.wg.net.udp.v1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
/*
 * UDPЭ��������ݣ�                   
	A:�������ն�Socket����              
	B:����һ�����ݰ�(��������)              
	C:����Socket����Ľ��շ�����������        
	D:�������ݰ�������ʾ�ڿ���̨              
	E:�ͷ���Դ                       
 * ����������նˣ�
 * 		java.net.BindException: Address already in use: Cannot bind
 * 		�˿ڱ�ռ�á�
 */
public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		// �������ն˵�Socket����
		DatagramSocket ds = new DatagramSocket(12345);

		// ����һ������
		byte[] bys = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bys, bys.length);

		// ��������
		ds.receive(dp);

		// ��������
		String ip = dp.getAddress().getHostAddress();
		int port = dp.getPort();
		String s = new String(dp.getData(), 0, dp.getLength());
		System.out.println("from " + ip + port + " data is : " + s);

		// �ͷ���Դ
		ds.close();
	}
}

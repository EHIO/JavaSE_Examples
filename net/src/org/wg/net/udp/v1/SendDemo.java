package org.wg.net.udp.v1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
/*
 * UDPЭ�鷢�����ݣ�                      
	A:�������Ͷ�Socket����                 
	B:�������ݣ��������ݴ��                   
	C:����Socket����ķ��ͷ����������ݰ�          
	D:�ͷ���Դ
 */                         
public class SendDemo {
	public static void main(String[] args) throws IOException {
		// �������Ͷ˵�Socket����
		DatagramSocket ds = new DatagramSocket();

		// �������ݲ����
		byte[] bys = "hello world".getBytes();
		DatagramPacket dp = new DatagramPacket(bys, bys.length,
				InetAddress.getByName("127.0.0.1"), 12345);

		// ��������
		ds.send(dp);

		// �ͷ���Դ
		ds.close();
	}
}

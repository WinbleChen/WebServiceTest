package local.wsPulish;

import javax.xml.ws.Endpoint;

import local.serviceImpl.TeacherDetailsImpl;

public class WSPulish {

	public static void main(String[] args) {
		String address = "http://192.168.1.16:8080/ws/teacher";
		// ʹ��Endpoint���ṩ��publish��������WebService������ʱҪ��֤ʹ�õĶ˿ں�û�б�����Ӧ�ó���ռ��
		Endpoint.publish(address, new TeacherDetailsImpl());
		System.out.println("����webservice�ɹ�!");
	}
}

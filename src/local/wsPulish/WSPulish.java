package local.wsPulish;

import javax.xml.ws.Endpoint;

import local.serviceImpl.TeacherDetailsImpl;

public class WSPulish {

	public static void main(String[] args) {
		String address = "http://192.168.1.16:8080/ws/teacher";
		// 使用Endpoint类提供的publish方法发布WebService，发布时要保证使用的端口号没有被其他应用程序占用
		Endpoint.publish(address, new TeacherDetailsImpl());
		System.out.println("发布webservice成功!");
	}
}

package local.service;

import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import local.dto.Student;
import local.dto.Teacher;

@WebService(name = "TeacherDetails",targetNamespace = "http://localhost/ws/teacher")
public interface TeacherDetails {
	
	Teacher retrieveStudents(Teacher teacher);
	
	String testString(String string);

}

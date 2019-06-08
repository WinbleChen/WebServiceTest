package local.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.handler.MessageContext;

import local.dto.Student;
import local.dto.Teacher;
import local.service.TeacherDetails;

@WebService(
	endpointInterface = "local.service.TeacherDetails",
	portName = "teacherPort",
	serviceName = "TeacherDetailsImpl",
	targetNamespace = "http://localhost/ws/teacher"
)
public class TeacherDetailsImpl implements TeacherDetails{

	@Override
	public Teacher retrieveStudents(Teacher teacher) {
		// TODO Auto-generated method stub
		Student student1 = new Student("www", "��");
		Student student2 = new Student("zzz", "Ů");
		Student student3 = new Student("qqq", "��");
		Teacher teacher1 = new Teacher(1, "��", null);
		Teacher teacher2 = new Teacher(2, "��", null);
		
		ArrayList<Student> students = new ArrayList<Student>();
		if (teacher1.getId() == teacher.getId()) {
			teacher1.getStudents().add(student1);
			teacher1.getStudents().add(student2);
			return teacher1;
		} else if (teacher2.getId() == teacher.getId()) {
			teacher2.getStudents().add(student3);
			return teacher2;
		} else {
			return null;
		}
		
		
	
	}

	@Override
	public String testString(String string) {
		// TODO Auto-generated method stub
		return "test -- hhh";
	}
	
	
	

}

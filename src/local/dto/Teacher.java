package local.dto;

import java.io.Serializable;
import java.util.List;

public class Teacher implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6452204540699971822L;
	
	private int id;
	private String name;
	private List<Student> students;
	
	public Teacher(int id, String name, List<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.students = students;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", students=" + students + "]";
	}
	
	
	

}

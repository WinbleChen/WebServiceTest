package local.dto;

import java.io.Serializable;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -917289573282200288L;
	
	private String name;
	
	private String sex;
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + "]";
	}

	public Student(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	


}

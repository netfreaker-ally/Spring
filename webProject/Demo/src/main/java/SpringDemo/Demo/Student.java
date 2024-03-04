package SpringDemo.Demo;

import java.util.List;

public class Student {
	 int studentNo;
	 String studentName;
	 List<Integer> markss;
	 List<Teacher> teachers;
	 
	public Student() {
		super();
	}

	public Student(int studentNo, String studentName, List<Integer> markss, List<Teacher> teachers) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.markss = markss;
		this.teachers = teachers;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<Integer> getMarkss() {
		return markss;
	}

	public void setMarkss(List<Integer> markss) {
		this.markss = markss;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	
}

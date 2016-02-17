package org.self.learn.bean;

public class School {
	private Student student;
	private Teacher teacher;
	private static School school = new School();
	private School(){
		//Empty private constructor
	}
	public static School getInstance(){
		return school;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
}

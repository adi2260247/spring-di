package org.self.learn.actor;

import org.self.learn.bean.Student;
import org.self.learn.bean.Teacher;

public class Teachership {

	private Teacher teacher;
	private Student student;
	
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String teach(){
		StringBuffer skills = new StringBuffer();
		for(String skill:getTeacher().getSkills())
			skills.append(skill+",");
		skills.deleteCharAt(skills.length()-1);
		return getTeacher().getName()+":"+"["+skills+"]"+" | "+getStudent().getName()
				+":"+getStudent().getGrade()+":"+getStudent().getAge();
	}
	
}

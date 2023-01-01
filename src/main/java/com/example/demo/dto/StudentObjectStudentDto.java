package com.example.demo.dto;

import java.io.Serializable;

import com.globits.education.domain.CourseYear;
import com.globits.education.domain.Student;
import com.globits.education.domain.StudentObject;
import com.globits.education.domain.StudentObjectStudent;

public class StudentObjectStudentDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private StudentObjectDto studentObject;
	private StudentDto student;
	private Boolean isEnable;
	private Boolean isCourse;//sử dụng cho toàn khóa
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public StudentObjectDto getStudentObject() {
		return studentObject;
	}
	public void setStudentObject(StudentObjectDto studentObject) {
		this.studentObject = studentObject;
	}
	public StudentDto getStudent() {
		return student;
	}
	public void setStudent(StudentDto student) {
		this.student = student;
	}
	public Boolean getIsEnable() {
		return isEnable;
	}
	public void setIsEnable(Boolean isEnable) {
		this.isEnable = isEnable;
	}
	
	public Boolean getIsCourse() {
		return isCourse;
	}
	public void setIsCourse(Boolean isCourse) {
		this.isCourse = isCourse;
	}
	public StudentObjectStudentDto() {

	}

	public StudentObjectStudentDto(StudentObjectStudent s) {
		if(s !=null) {
			this.id = s.getId();
			if(s.getStudent() != null) {
				this.student = new StudentDto();
				this.student.setId(s.getStudent().getId());
				this.student.setStudentCode(s.getStudent().getStudentCode());
				this.student.setFirstName(s.getStudent().getFirstName());
				this.student.setLastName(s.getStudent().getLastName());
				this.student.setDisplayName(s.getStudent().getDisplayName());
			}
			if(s.getStudentObject() != null) {
				this.studentObject = new StudentObjectDto();
				this.studentObject.setId(s.getStudentObject().getId());
				this.studentObject.setName(s.getStudentObject().getName());
				this.studentObject.setCode(s.getStudentObject().getCode());
			}
			this.isEnable = s.getIsEnable();
			this.isCourse=s.getIsCourse();
		}
	}
}

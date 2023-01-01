package com.example.demo.dto;

import java.io.Serializable;

import com.globits.education.domain.CourseYear;
import com.globits.education.domain.Semester;
import com.globits.education.domain.Student;
import com.globits.education.domain.StudentObject;
import com.globits.education.domain.StudentObjectStudent;
import com.globits.education.domain.StudentObjectStudentSemester;


public class StudentObjectStudentSemesterDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private StudentObjectDto studentObject;
	private StudentDto student;
	private Boolean isEnable;
	private SemesterDto semester;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public SemesterDto getSemester() {
		return semester;
	}
	public void setSemester(SemesterDto semester) {
		this.semester = semester;
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
	public StudentObjectStudentSemesterDto() {

	}

	public StudentObjectStudentSemesterDto(StudentObjectStudentSemester s) {
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
			if(s.getSemester() != null) {
				this.semester = new SemesterDto();
				this.semester.setId(s.getSemester().getId());
				this.semester.setSemesterName(s.getSemester().getSemesterName());
				this.semester.setSemesterCode(s.getSemester().getSemesterCode());
			}
			this.isEnable = s.getIsEnable();
		}
	}
}

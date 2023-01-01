package com.example.demo.dto;

import java.util.Date;

import com.globits.education.domain.StudentMarkHistory;

public class StudentMarkHistoryDto {
	private Long id;
	private Date actionTime;
	private Double mark;
	private String userModifi;
	private SemesterDto semester;
	private StudentDto student;
	private SubjectDto subject;
	private SubjectExamDto subjectExam;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getActionTime() {
		return actionTime;
	}
	public void setActionTime(Date actionTime) {
		this.actionTime = actionTime;
	}
	public Double getMark() {
		return mark;
	}
	public void setMark(Double mark) {
		this.mark = mark;
	}
	public String getUserModifi() {
		return userModifi;
	}
	public void setUserModifi(String userModifi) {
		this.userModifi = userModifi;
	}
	public SemesterDto getSemester() {
		return semester;
	}
	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}
	public StudentDto getStudent() {
		return student;
	}
	public void setStudent(StudentDto student) {
		this.student = student;
	}
	public SubjectDto getSubject() {
		return subject;
	}
	public void setSubject(SubjectDto subject) {
		this.subject = subject;
	}
	public SubjectExamDto getSubjectExam() {
		return subjectExam;
	}
	public void setSubjectExam(SubjectExamDto subjectExam) {
		this.subjectExam = subjectExam;
	}
	public StudentMarkHistoryDto() {
		
	}
	
	public StudentMarkHistoryDto(StudentMarkHistory studentMarkHistory) {
		this.id = studentMarkHistory.getId();
		this.actionTime = studentMarkHistory.getActionTime();
		this.mark = studentMarkHistory.getMark();
		if(studentMarkHistory.getUsername() != null) {
			this.userModifi = studentMarkHistory.getUsername();
		}

	}
}

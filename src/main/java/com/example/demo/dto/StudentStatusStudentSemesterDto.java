package com.example.demo.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;

import com.globits.core.dto.StatusDto;
import com.globits.education.domain.Decision;
import com.globits.education.domain.StudentStatusStudentSemester;


public class StudentStatusStudentSemesterDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private StatusDto studentStatus;
	private StudentDto student;
	private Integer status;//trạng thái sinh viên
	private SemesterDto semester;
	private Date startDate;			//Ngày bắt đầu
	private Date endDate;	
	private DecisionDto decision;//quyết định
	
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
	public StudentDto getStudent() {
		return student;
	}
	public void setStudent(StudentDto student) {
		this.student = student;
	}
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public DecisionDto getDecision() {
		return decision;
	}
	public void setDecision(DecisionDto decision) {
		this.decision = decision;
	}
	
	
	public StatusDto getStudentStatus() {
		return studentStatus;
	}
	public void setStudentStatus(StatusDto studentStatus) {
		this.studentStatus = studentStatus;
	}
	public StudentStatusStudentSemesterDto() {

	}

	public StudentStatusStudentSemesterDto(StudentStatusStudentSemester s) {
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
			
			if(s.getSemester() != null) {
				this.semester = new SemesterDto();
				this.semester.setId(s.getSemester().getId());
				this.semester.setSemesterName(s.getSemester().getSemesterName());
				this.semester.setSemesterCode(s.getSemester().getSemesterCode());
				this.semester.setOrdinalNumbers(s.getSemester().getOrdinalNumbers());
			}
			if(s.getDecision()!=null) {
				this.decision=new DecisionDto();
				this.decision.setId(s.getDecision().getId());
				this.decision.setCode(s.getDecision().getCode());
				this.decision.setName(s.getDecision().getName());
			}
			if(s.getStudentStatus()!=null) {
				this.studentStatus=new StatusDto();
				this.studentStatus.setId(s.getStudentStatus().getId());
				this.studentStatus.setCode(s.getStudentStatus().getCode());
				this.studentStatus.setName(s.getStudentStatus().getName());
			}
			this.status = s.getStatus();
			this.startDate=s.getStartDate();
			this.endDate=s.getEndDate();
		}
	}
}

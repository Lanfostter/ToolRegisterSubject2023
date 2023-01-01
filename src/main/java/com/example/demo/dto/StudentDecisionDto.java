package com.example.demo.dto;

import java.io.Serializable;

import com.globits.education.domain.StudentDecision;

public class StudentDecisionDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private StudentDto student;	//Sinh viên
	private DecisionDto decision;	// quyết định
	private Long studentId;
	private Long decisionId;
	private Long enrollmentClassId;
	private Long specialityId;
	private Long departmentId;
	private Long courseYearId;
	private String nameCode;
	private Long traningBase;
	private Long decisionType;
	
	public StudentDto getStudent() {
		return student;
	}
	public void setStudent(StudentDto student) {
		this.student = student;
	}
	public DecisionDto getDecision() {
		return decision;
	}
	public void setDecision(DecisionDto decision) {
		this.decision = decision;
	}	
	
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public Long getDecisionId() {
		return decisionId;
	}
	public void setDecisionId(Long decisionId) {
		this.decisionId = decisionId;
	}
	public Long getEnrollmentClassId() {
		return enrollmentClassId;
	}
	public void setEnrollmentClassId(Long enrollmentClassId) {
		this.enrollmentClassId = enrollmentClassId;
	}
	public Long getSpecialityId() {
		return specialityId;
	}
	public void setSpecialityId(Long specialityId) {
		this.specialityId = specialityId;
	}
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public Long getCourseYearId() {
		return courseYearId;
	}
	public void setCourseYearId(Long courseYearId) {
		this.courseYearId = courseYearId;
	}
	
	public Long getTraningBase() {
		return traningBase;
	}
	public void setTraningBase(Long traningBase) {
		this.traningBase = traningBase;
	}
	public Long getDecisionType() {
		return decisionType;
	}
	public void setDecisionType(Long decisionType) {
		this.decisionType = decisionType;
	}
	public String getNameCode() {
		return nameCode;
	}
	public void setNameCode(String nameCode) {
		this.nameCode = nameCode;
	}
	public StudentDecisionDto() {
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public StudentDecisionDto(StudentDecision entity) {
		if (entity != null) {
			this.id = entity.getId();
			if (entity.getStudent() != null) {
				StudentDto studentDto = new StudentDto(entity.getStudent(), false);
				
				this.student = studentDto;
			}
			
			if (entity.getDecision() != null) {
				DecisionDto decisionDto = new DecisionDto(entity.getDecision(), true);

				this.decision = decisionDto;
			}
			
		}
	}
	
}

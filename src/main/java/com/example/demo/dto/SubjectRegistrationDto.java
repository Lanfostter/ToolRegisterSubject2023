package com.example.demo.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SubjectRegistrationDto implements Serializable {

	private static final long serialVersionUID = 3890325594352702333L;

	private Long Id;

	private String subjectName;
	
	private Long registerPeriodId;
	//Cần đăng ký các môn song hành
	private Boolean hasParaSubject=false;
	private Boolean isForcedRegType =false;
	private List<String> paraSubjects;
	private List<String> dependSubjectNames;
	
	private Set<CourseSubjectDto> courseSubjectDtos;
	
	private  Boolean isAllowSubjectUnRegister = true;
	
	private Boolean hasSubjectReg;//Có môn đăng ký học
	/**
	 * Đánh dấu là môn học nâng điểm
	 */
	private Boolean isUpgradeMark;
	
	private Boolean isRegisterd;
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Set<CourseSubjectDto> getCourseSubjectDtos() {
		return courseSubjectDtos;
	}

	public void setCourseSubjectDtos(Set<CourseSubjectDto> courseSubjectDtos) {
		this.courseSubjectDtos = courseSubjectDtos;
	}

	public Long getRegisterPeriodId() {
		return registerPeriodId;
	}

	public void setRegisterPeriodId(Long registerPeriodId) {
		this.registerPeriodId = registerPeriodId;
	}

	public Boolean getHasParaSubject() {
		return hasParaSubject;
	}

	public void setHasParaSubject(Boolean hasParaSubject) {
		this.hasParaSubject = hasParaSubject;
	}

	public List<String> getParaSubjects() {
		return paraSubjects;
	}

	public void setParaSubjects(List<String> paraSubjects) {
		this.paraSubjects = paraSubjects;
	}

	public Boolean getIsForcedRegType() {
		return isForcedRegType;
	}

	public void setIsForcedRegType(Boolean isForcedRegType) {
		this.isForcedRegType = isForcedRegType;
	}

	public Boolean getIsUpgradeMark() {
		return isUpgradeMark;
	}

	public void setIsUpgradeMark(Boolean isUpgradeMark) {
		this.isUpgradeMark = isUpgradeMark;
	}

	public Boolean getIsAllowSubjectUnRegister() {
		return isAllowSubjectUnRegister;
	}

	public void setIsAllowSubjectUnRegister(Boolean isAllowSubjectUnRegister) {
		this.isAllowSubjectUnRegister = isAllowSubjectUnRegister;
	}

	public List<String> getDependSubjectNames() {
		return dependSubjectNames;
	}

	public void setDependSubjectNames(List<String> dependSubjectNames) {
		this.dependSubjectNames = dependSubjectNames;
	}

	public Boolean getHasSubjectReg() {
		return hasSubjectReg;
	}

	public void setHasSubjectReg(Boolean hasSubjectReg) {
		this.hasSubjectReg = hasSubjectReg;
	}

}

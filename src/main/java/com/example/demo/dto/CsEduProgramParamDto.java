package com.example.demo.dto;

import java.io.Serializable;
import java.util.List;

public class CsEduProgramParamDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6022697862285413241L;
	private Long programId;
	private List<PrerequisiteSubjectDto> listPreSubject;
	private List<CourseSubjectDto> listCs;
	private List<CourseSubjectConfigDto> listConfig;
	public Long getProgramId() {
		return programId;
	}
	public void setProgramId(Long programId) {
		this.programId = programId;
	}
	public List<PrerequisiteSubjectDto> getListPreSubject() {
		return listPreSubject;
	}
	public void setListPreSubject(List<PrerequisiteSubjectDto> listPreSubject) {
		this.listPreSubject = listPreSubject;
	}
	public List<CourseSubjectDto> getListCs() {
		return listCs;
	}
	public void setListCs(List<CourseSubjectDto> listCs) {
		this.listCs = listCs;
	}
	public List<CourseSubjectConfigDto> getListConfig() {
		return listConfig;
	}
	public void setListConfig(List<CourseSubjectConfigDto> listConfig) {
		this.listConfig = listConfig;
	}
}

package com.example.demo.dto;
import java.io.Serializable;

import com.globits.education.domain.SubjectEducationLevelType;

public class SubjectEducationLevelTypeDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private SubjectDto subject;
	private EducationLevelDto educationLevel;
	private EducationTypeDto educationType;
	private String textSearch;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public SubjectDto getSubject() {
		return subject;
	}
	public void setSubject(SubjectDto subject) {
		this.subject = subject;
	}
	public EducationLevelDto getEducationLevel() {
		return educationLevel;
	}
	public void setEducationLevel(EducationLevelDto educationLevel) {
		this.educationLevel = educationLevel;
	}
	public EducationTypeDto getEducationType() {
		return educationType;
	}
	public void setEducationType(EducationTypeDto educationType) {
		this.educationType = educationType;
	}
	public String getTextSearch() {
		return textSearch;
	}
	public void setTextSearch(String textSearch) {
		this.textSearch = textSearch;
	}
	public SubjectEducationLevelTypeDto() {

	}

	public SubjectEducationLevelTypeDto(SubjectEducationLevelType c) {
		this.id = c.getId();
		if(c.getSubject() != null) {
			this.subject = new SubjectDto();
			this.subject.setId(c.getSubject().getId());
			this.subject.setSubjectName(c.getSubject().getSubjectName());
			this.subject.setSubjectCode(c.getSubject().getSubjectCode());
		}
		if(c.getEducationLevel() != null) {
			this.educationLevel = new EducationLevelDto();
			this.educationLevel.setId(c.getEducationLevel().getId());
			this.educationLevel.setName(c.getEducationLevel().getName());
			this.educationLevel.setCode(c.getEducationLevel().getCode());
		}
		if(c.getEducationType() != null) {
			this.educationType = new EducationTypeDto();
			this.educationType.setId(c.getEducationType().getId());
			this.educationType.setName(c.getEducationType().getName());
			this.educationType.setCode(c.getEducationType().getCode());
		}
	}
}

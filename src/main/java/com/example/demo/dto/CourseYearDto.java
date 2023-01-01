package com.example.demo.dto;

import java.io.Serializable;

import com.globits.education.domain.CourseYear;
import com.globits.education.domain.EducationLevel;
import com.globits.education.domain.EducationType;

public class CourseYearDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String code;
	private Integer year;
	private EducationTypeDto educationType;
	private EducationLevelDto educationLevel;
	private String textSearch;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public EducationTypeDto getEducationType() {
		return educationType;
	}

	public void setEducationType(EducationTypeDto educationType) {
		this.educationType = educationType;
	}

	public EducationLevelDto getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(EducationLevelDto educationLevel) {
		this.educationLevel = educationLevel;
	}

	public String getTextSearch() {
		return textSearch;
	}

	public void setTextSearch(String textSearch) {
		this.textSearch = textSearch;
	}

	public CourseYearDto() {

	}

	public CourseYearDto(CourseYear cy) {
		if(cy !=null) {
			this.id = cy.getId();
			this.code = cy.getCode();
			this.name = cy.getName();
			this.year = cy.getYear();
			if(cy.getEducationType()!=null)
			this.educationType= new EducationTypeDto(cy.getEducationType());
			if(cy.getEducationLevel()!=null)
			this.educationLevel=new EducationLevelDto(cy.getEducationLevel());
		}
	}
	public CourseYearDto(CourseYear cy,Boolean collapse) {
		if(cy !=null) {
			this.id = cy.getId();
			this.code = cy.getCode();
			this.name = cy.getName();
			this.year = cy.getYear();
		
		}
	}
}

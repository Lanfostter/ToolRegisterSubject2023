package com.example.demo.dto;

import java.io.Serializable;

import com.globits.education.domain.EducationType;

public class EducationTypeDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String code;
	private String description;
	private String nameEng;//tên tiếng anh
	
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

	public String getNameEng() {
		return nameEng;
	}

	public void setNameEng(String nameEng) {
		this.nameEng = nameEng;
	}

	public EducationTypeDto() {

	}

	public EducationTypeDto(EducationType et) {
		if(et != null) {
			this.id = et.getId();
			this.code = et.getCode();
			this.name = et.getName();
			this.description = et.getDescription();
			this.nameEng=et.getNameEng();
		}
	}
}

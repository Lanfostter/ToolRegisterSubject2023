package com.example.demo.dto;

import java.io.Serializable;

import com.globits.education.domain.EducationLevel;

public class EducationLevelDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String code;
	private String description;
	private String numbericCode;
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

	public String getNumbericCode() {
		return numbericCode;
	}

	public void setNumbericCode(String numbericCode) {
		this.numbericCode = numbericCode;
	}

	public EducationLevelDto() {

	}

	public EducationLevelDto(EducationLevel el) {
		this.code = el.getCode();
		this.name = el.getName();
		this.description = el.getDescription();
		this.numbericCode = el.getNumbericCode();
	}
}

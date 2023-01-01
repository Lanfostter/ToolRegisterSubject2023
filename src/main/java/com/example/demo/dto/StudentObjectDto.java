package com.example.demo.dto;

import java.io.Serializable;

import com.globits.education.domain.StudentObject;

public class StudentObjectDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String code;
	private Integer type;
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

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public StudentObjectDto() {

	}

	public StudentObjectDto(StudentObject cy) {
		if(cy !=null) {
			this.id = cy.getId();
			this.code = cy.getCode();
			this.name = cy.getName();
			this.type = cy.getType();
		}
	}
}

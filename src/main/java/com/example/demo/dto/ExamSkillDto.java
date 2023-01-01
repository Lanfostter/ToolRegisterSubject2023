package com.example.demo.dto;

import com.globits.education.domain.ExamSkill;

public class ExamSkillDto {
	private Long id;
	private String name;
	private String code;
	
	private boolean isDuplicate;
	private String dupName;
	private String dupCode;
	
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
	public boolean isDuplicate() {
		return isDuplicate;
	}
	public void setDuplicate(boolean isDuplicate) {
		this.isDuplicate = isDuplicate;
	}
	public String getDupName() {
		return dupName;
	}
	public void setDupName(String dupName) {
		this.dupName = dupName;
	}
	public String getDupCode() {
		return dupCode;
	}
	public void setDupCode(String dupCode) {
		this.dupCode = dupCode;
	}
	public ExamSkillDto() {
		
	}
	
	public ExamSkillDto( ExamSkill entity) {
		this.name = entity.getName();
		this.code = entity.getCode();
		this.id = entity.getId();
	}
}

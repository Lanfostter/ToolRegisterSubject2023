package com.example.demo.dto;

import java.io.Serializable;

import com.globits.education.domain.MarkType;
import com.globits.education.domain.SubjectExam;
import com.globits.education.domain.SubjectExamType;

public class SubjectExamTypeDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long Id;
	private String name;
	private String code;
	private String note;
	private Integer type;
	private boolean isDuplicate;
	private String dupName;
	private String dupCode;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
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

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
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

	public SubjectExamTypeDto() {

	}

	public SubjectExamTypeDto(SubjectExamType se) {
		if(se!=null) {
			this.Id = se.getId();
			this.name = se.getName();
			this.code = se.getCode();
			this.note=se.getNote();
			this.type=se.getType();
		}		
	}

}

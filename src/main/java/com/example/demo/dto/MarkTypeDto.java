package com.example.demo.dto;

import java.io.Serializable;

import com.globits.education.domain.MarkType;

public class MarkTypeDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long Id;
	private String markTypeName;
	private String markTypeCode;
	private boolean isDuplicate;
	private String dupName;
	private String dupCode;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getMarkTypeName() {
		return markTypeName;
	}

	public void setMarkTypeName(String markTypeName) {
		this.markTypeName = markTypeName;
	}

	public String getMarkTypeCode() {
		return markTypeCode;
	}

	public void setMarkTypeCode(String markTypeCode) {
		this.markTypeCode = markTypeCode;
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

	public MarkTypeDto() {

	}

	public MarkTypeDto(MarkType sr) {
		if(sr!=null) {
			this.Id = sr.getId();
			this.markTypeCode = sr.getMarkTypeCode();
			this.markTypeName = sr.getMarkTypeName();
		}		
	}

}

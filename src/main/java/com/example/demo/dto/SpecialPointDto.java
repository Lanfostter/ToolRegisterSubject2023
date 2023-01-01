package com.example.demo.dto;

import javax.persistence.Column;

import com.globits.education.domain.ExamSkill;
import com.globits.education.domain.SpecialPoint;

public class SpecialPointDto {
	private Long id;
	private String name;
	private String code;
	
	private boolean isDuplicate;
	private String dupName;
	private String dupCode;
	private String note;
	private Boolean isStatusSpecialPoint = false;//xét sự tồn tại bỏ thi, miễn thi có lý do
	
	private int status;//Trạng thái
	
	private double mark;
	
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
	
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	
	public Boolean getIsStatusSpecialPoint() {
		return isStatusSpecialPoint;
	}
	public void setIsStatusSpecialPoint(Boolean isStatusSpecialPoint) {
		this.isStatusSpecialPoint = isStatusSpecialPoint;
	}
	public SpecialPointDto() {
		
	}
	
	public SpecialPointDto( SpecialPoint entity) {
		this.name = entity.getName();
		this.code = entity.getCode();
		this.id = entity.getId();
		this.mark=entity.getMark();
		this.note=entity.getNote();
		this.status=entity.getStatus();
	}
}

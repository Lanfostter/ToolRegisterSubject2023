package com.example.demo.dto;

import java.io.Serializable;
import com.globits.education.domain.ExamStatus;

public class ExamStatusDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String note;
	private String penalties;//Hình thức cảnh cáo
	private double mark;//phần trăm điểm sẽ bị trừ
	private Boolean suspend;//bị cấm thi
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getPenalties() {
		return penalties;
	}
	public void setPenalties(String penalties) {
		this.penalties = penalties;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	public Boolean getSuspend() {
		return suspend;
	}
	public void setSuspend(Boolean suspend) {
		this.suspend = suspend;
	}
	public ExamStatusDto() {
		
	}
	
	public ExamStatusDto( ExamStatus entity) {
		this.id = entity.getId();
		this.note=entity.getNote();
		this.mark=entity.getMark();
		this.penalties=entity.getPenalties();
		this.suspend=entity.getSuspend();
	}
}

package com.example.demo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.globits.education.domain.ExamHour;
import com.globits.education.domain.ExamType;

public class ExamTypeDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String code;
	private boolean isDuplicate;
	private String dupName;
	private String dupCode;
	private Integer duration;
	private List<ExamHourDto> examHours;
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

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public List<ExamHourDto> getExamHours() {
		return examHours;
	}

	public void setExamHours(List<ExamHourDto> examHours) {
		this.examHours = examHours;
	}

	public ExamTypeDto() {

	}

	public ExamTypeDto(ExamType et) {
		this.code = et.getCode();
		this.name = et.getName();
		this.id = et.getId();
		this.duration =et.getDuration();
		if(et.getExamHours()!=null) {
			this.examHours = new ArrayList<ExamHourDto>();
			for(ExamHour eh: et.getExamHours()) {
				ExamHourDto ehDto = new ExamHourDto();
				ehDto.setId(eh.getId());
				ehDto.setCode(eh.getCode());
				ehDto.setName(eh.getName());
				this.examHours.add(ehDto);
			}
		}
	}
}

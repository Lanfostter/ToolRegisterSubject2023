package com.example.demo.dto;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.globits.education.domain.SemesterSubjectExamDate;
import com.globits.education.domain.ExamHour;

public class ExamHourDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Date start; // Thời điểm bắt đầu
	private String startString;
	private Date end; // thời điểm kết thúc 
	private String endString;
	private Integer type;
	private String name;
	private String code;
	private boolean isDuplicate;
	private String dupName;
	private String dupCode;
	private SemesterSubjectExamDateDto examDate;
	private ExamTypeDto examType;
	private Integer viewIndex;
	
	public SemesterSubjectExamDateDto getExamDate() {
		return examDate;
	}

	public void setExamDate(SemesterSubjectExamDateDto examDate) {
		this.examDate = examDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getStart() {
		return start;
	}

	public String getStartString() {
		try {
			 SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");  
			 startString = formatter.format(this.start);
		} catch (Exception e) {
			// TODO: handle exception
		}		  
		return startString;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public String getEndString() {
		try {
			 SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");  
			 endString = formatter.format(this.end);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return endString;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
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

	public ExamTypeDto getExamType() {
		return examType;
	}

	public void setExamType(ExamTypeDto examType) {
		this.examType = examType;
	}

	public Integer getViewIndex() {
		return viewIndex;
	}

	public void setViewIndex(Integer viewIndex) {
		this.viewIndex = viewIndex;
	}

	public ExamHourDto() {

	}

	public ExamHourDto(ExamHour et) {
		this.start = et.getStart();
		this.end = et.getEnd();
		this.id = et.getId();
		this.type=et.getType();
		this.name=et.getName();
		this.code=et.getCode();
		this.viewIndex = et.getViewIndex();
		if(et.getExamType()!=null) {
			this.examType = new ExamTypeDto();
			this.examType.setId(et.getExamType().getId());
			this.examType.setCode(et.getExamType().getCode());
			this.examType.setName(et.getExamType().getName());
		}
	}
}

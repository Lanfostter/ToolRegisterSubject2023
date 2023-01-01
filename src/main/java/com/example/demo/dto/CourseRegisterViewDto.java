package com.example.demo.dto;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CourseRegisterViewDto implements Serializable {
	private boolean isAllowRegister; 
	private Boolean isAllowUnRegister;//Cho phép hủy học phần đăng ký học
	//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private Date startDate;
	private Date endDate;
	
	private String startDateString;
	private String endDateString;
	
	private Date startUnDate;
	private Date endUnDate;
	
	private String startUnDateString;
	private String endUnDateString;
	
	private List<SubjectRegistrationDto> listSubjectRegistrationDtos;
	private Boolean isDuplicated;
	
	private List<CourseSubjectDto> listOldCs;
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getStartDateString() {
		try {
			 SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");  
			 this.startDateString = formatter.format(this.startDate);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return startDateString;
	}
	public String getEndDateString() {
		try {
			 SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");  
			 this.endDateString = formatter.format(this.endDate);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return endDateString;
	}
	
	public Date getStartUnDate() {
		return startUnDate;
	}
	public void setStartUnDate(Date startUnDate) {
		this.startUnDate = startUnDate;
	}
	public Date getEndUnDate() {
		return endUnDate;
	}
	public String getStartUnDateString() {
		try {
			 SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");  
			 this.startUnDateString = formatter.format(this.startUnDate);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return startUnDateString;
	}
	public String getEndUnDateString() {
		try {
			 SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");  
			 this.endUnDateString = formatter.format(this.endUnDate);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return endUnDateString;
	}
	public void setEndUnDate(Date endUnDate) {
		this.endUnDate = endUnDate;
	}
	public List<SubjectRegistrationDto> getListSubjectRegistrationDtos() {
		return listSubjectRegistrationDtos;
	}
	public void setListSubjectRegistrationDtos(List<SubjectRegistrationDto> listSubjectRegistrationDtos) {
		this.listSubjectRegistrationDtos = listSubjectRegistrationDtos;
	}
	public boolean isAllowRegister() {
		return isAllowRegister;
	}
	public void setAllowRegister(boolean isAllowRegister) {
		this.isAllowRegister = isAllowRegister;
	}
	public Boolean getIsDuplicated() {
		return isDuplicated;
	}
	public void setIsDuplicated(Boolean isDuplicated) {
		this.isDuplicated = isDuplicated;
	}
	public Boolean getIsAllowUnRegister() {
		return isAllowUnRegister;
	}
	public void setIsAllowUnRegister(Boolean isAllowUnRegister) {
		this.isAllowUnRegister = isAllowUnRegister;
	}
	public List<CourseSubjectDto> getListOldCs() {
		return listOldCs;
	}
	public void setListOldCs(List<CourseSubjectDto> listOldCs) {
		this.listOldCs = listOldCs;
	}
}

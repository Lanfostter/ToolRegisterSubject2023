package com.example.demo.dto;

import java.io.Serializable;

import javax.persistence.Column;

import com.globits.core.domain.Status;
import com.globits.core.dto.StatusDto;
import com.globits.education.domain.StudentDecisionType;

public class StudentDecisionTypeDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long Id;
	private String name;
	private String code;
	/*
	 * Trạng thái 
	 * -7:dừng học ngành 2
	 * -6:thôi học ngành 2
	 * -5 :Thôi học
	 * -4: Xóa tên (XOATEN)
	 * -3: Bị đuổi học (FORCEDROPOUT)
	 * -2: chuyển trường (CHUYENTRUONGDI)
	 * -1: bảo lưu (dừng học - DUNGHOC)
	 * 0: chưa nhập học
	 * 1: đã nhập học, đang học (NORMAL)
	 * 2: đã tốt nghiệp (GRADUATE)
	 * 3: Quay trở lại (REPEATE)
	 * 4:Chuyển khóa- ngành - lớp
	 * 5:chuyển trường đến 
	 * 6: RESERVE (chưa rõ là gì)
	 */
	private Integer status;
	private StatusDto studentStatus;//trạng thái sinh viên
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
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
		
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public StatusDto getStudentStatus() {
		return studentStatus;
	}
	public void setStudentStatus(StatusDto studentStatus) {
		this.studentStatus = studentStatus;
	}
	public StudentDecisionTypeDto() {
	}
	
	public StudentDecisionTypeDto(StudentDecisionType entity) {
		this.name = entity.getName();
		this.code = entity.getCode();
		this.Id = entity.getId();
		this.status=entity.getStatus();
		if(entity.getStudentStatus()!=null) {
			this.studentStatus=new StatusDto();
			this.studentStatus.setId(entity.getStudentStatus().getId());
			this.studentStatus.setCode(entity.getStudentStatus().getCode());
			this.studentStatus.setName(entity.getStudentStatus().getName());
		}
	}

}

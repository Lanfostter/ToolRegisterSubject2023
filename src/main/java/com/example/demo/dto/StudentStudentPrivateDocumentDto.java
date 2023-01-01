package com.example.demo.dto;

import java.io.Serializable;
import java.util.Date;

import org.joda.time.LocalDateTime;

import com.globits.education.domain.StudentStudentPrivateDocument;

public class StudentStudentPrivateDocumentDto implements Serializable{
	private Long id;
	private StudentDto student;
	private StudentPrivateDocumentDto studentPrivateDocument;
	private Boolean hasProfile;
	private Date createDate;
	private String createBy;
	
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public StudentDto getStudent() {
		return student;
	}
	public void setStudent(StudentDto student) {
		this.student = student;
	}
	public StudentPrivateDocumentDto getStudentPrivateDocument() {
		return studentPrivateDocument;
	}
	public void setStudentPrivateDocument(StudentPrivateDocumentDto studentPrivateDocument) {
		this.studentPrivateDocument = studentPrivateDocument;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Boolean getHasProfile() {
		return hasProfile;
	}
	public void setHasProfile(Boolean hasProfile) {
		this.hasProfile = hasProfile;
	}
	public StudentStudentPrivateDocumentDto() {
		super();
	}
	public StudentStudentPrivateDocumentDto(StudentStudentPrivateDocument entity) {
		if(entity!= null) {
			if(entity.getStudent() != null) {
				this.student = new StudentDto(entity.getStudent());
			}
			if(entity.getStudentPrivateDocument() != null) {
				this.studentPrivateDocument = new StudentPrivateDocumentDto(entity.getStudentPrivateDocument());
			}
			if(entity.getHasProfile() != null) {
				this.hasProfile = entity.getHasProfile();
			}else {
				this.hasProfile = false;
			}
			if(entity.getCreateDate() != null) {
				this.createDate = entity.getCreateDate().toDate();
			}
			this.createBy = entity.getCreatedBy();
		}
	}
	
}

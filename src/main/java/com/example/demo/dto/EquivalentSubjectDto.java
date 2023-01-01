package com.example.demo.dto;

import java.io.Serializable;

import com.globits.education.domain.EquivalentSubject;

public class EquivalentSubjectDto implements Serializable {
	private static final long serialVersionUID = -574457765711630567L;
	private Long id;
	private SubjectDto subject;
	private ProgramSubjectDto programSubject;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public SubjectDto getSubject() {
		return subject;
	}
	public void setSubject(SubjectDto subject) {
		this.subject = subject;
	}
	public ProgramSubjectDto getProgramSubject() {
		return programSubject;
	}
	public void setProgramSubject(ProgramSubjectDto programSubject) {
		this.programSubject = programSubject;
	}
	
	public EquivalentSubjectDto() {
	}
	
	public EquivalentSubjectDto(EquivalentSubject e) {
		this.id = e.getId();
		if(e.getSubject() != null) {
			SubjectDto dto = new SubjectDto();
			dto.setId(e.getSubject().getId());
			dto.setSubjectName(e.getSubject().getSubjectName());
			dto.setSubjectCode(e.getSubject().getSubjectCode());
			this.setSubject(dto);
		}
		if(e.getProgramSubject() != null) {
			ProgramSubjectDto dto = new ProgramSubjectDto();
			dto.setId(e.getProgramSubject().getId());
		}
	}
}

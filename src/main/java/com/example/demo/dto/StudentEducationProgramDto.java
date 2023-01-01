package com.example.demo.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.globits.education.domain.EducationProgram;
import com.globits.education.domain.Student;
import com.globits.education.domain.StudentEducationProgram;

public class StudentEducationProgramDto implements Serializable{
	
	private Long id;
	
	private StudentDto student;	
	
	private EducationProgramDto program;
	
	private Boolean isMain;//Có phải ngành chính hay không?
	
	private Integer status;
	
	private Boolean isInListGraduation;
	

	public StudentDto getStudent() {
		return student;
	}

	public void setStudent(StudentDto student) {
		this.student = student;
	}

	public EducationProgramDto getProgram() {
		return program;
	}

	public void setProgram(EducationProgramDto program) {
		this.program = program;
	}

	public Boolean getIsMain() {
		return isMain;
	}

	public void setIsMain(Boolean isMain) {
		this.isMain = isMain;
	}

	
	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getIsInListGraduation() {
		return isInListGraduation;
	}

	public void setIsInListGraduation(Boolean isInListGraduation) {
		this.isInListGraduation = isInListGraduation;
	}

	public StudentEducationProgramDto() {
		
	}
	public StudentEducationProgramDto(StudentEducationProgram studentEducationProgram) {
		this.id = studentEducationProgram.getId();
		this.isMain = studentEducationProgram.getIsMain();
		this.status = studentEducationProgram.getStatus();
		if(studentEducationProgram.getProgram()!=null) {
			EducationProgramDto educationProgramDto = new EducationProgramDto(studentEducationProgram.getProgram());
			this.program = educationProgramDto;
		}
		if(studentEducationProgram.getStudent()!=null) {
			StudentDto dto = new StudentDto();
			dto.setId(studentEducationProgram.getStudent().getId());
			dto.setStudentCode(studentEducationProgram.getStudent().getStudentCode());
			dto.setDisplayName(studentEducationProgram.getStudent().getDisplayName());			
		}
		this.isInListGraduation = studentEducationProgram.getIsInListGraduation();
	}
	public StudentEducationProgramDto(StudentEducationProgram studentEducationProgram,boolean simple) {
		this.id = studentEducationProgram.getId();
		this.isMain = studentEducationProgram.getIsMain();
		this.status = studentEducationProgram.getStatus();
		this.isInListGraduation = studentEducationProgram.getIsInListGraduation();
		if(studentEducationProgram.getProgram()!=null) {			
			this.program = new EducationProgramDto();
			this.program.setId(studentEducationProgram.getProgram().getId());
			this.program.setCode(studentEducationProgram.getProgram().getCode());
			this.program.setName(studentEducationProgram.getProgram().getName());
			if(studentEducationProgram.getProgram().getSpeciality()!=null) {
				this.program.setSpeciality(new SpecialityDto());
				this.program.getSpeciality().setId(studentEducationProgram.getProgram().getSpeciality().getId());
				this.program.getSpeciality().setName(studentEducationProgram.getProgram().getSpeciality().getName());
				this.program.getSpeciality().setCode(studentEducationProgram.getProgram().getSpeciality().getCode());
			}
		}
		if(studentEducationProgram.getStudent()!=null) {
			StudentDto dto = new StudentDto();
			dto.setId(studentEducationProgram.getStudent().getId());
			dto.setStudentCode(studentEducationProgram.getStudent().getStudentCode());
			dto.setDisplayName(studentEducationProgram.getStudent().getDisplayName());
			dto.setStatus(studentEducationProgram.getStudent().getStatus());
			if(studentEducationProgram.getStudent().getEnrollmentClass()!=null) {
				dto.setEnrollmentClass(new EnrollmentClassDto());
				dto.getEnrollmentClass().setId(studentEducationProgram.getStudent().getEnrollmentClass().getId());
				dto.getEnrollmentClass().setClassName(studentEducationProgram.getStudent().getEnrollmentClass().getClassName());
				dto.getEnrollmentClass().setClassCode(studentEducationProgram.getStudent().getEnrollmentClass().getClassCode());
			}
			this.student = dto;
		}
		
	}
}

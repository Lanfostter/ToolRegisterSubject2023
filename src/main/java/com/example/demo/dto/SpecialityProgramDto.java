package com.example.demo.dto;

import java.io.Serializable;
import java.util.Date;

import com.globits.education.domain.SpecialityProgram;

public class SpecialityProgramDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SpecialityDto speciality;

	private EducationProgramDto program;

	private Date applyFromDate;

	private Date applyToDate;

	private Long fromSchoolYear;

	private Long toSchoolYear;

	private Boolean isCurrent = true;

	public SpecialityDto getSpeciality() {
		return speciality;
	}

	public void setSpeciality(SpecialityDto speciality) {
		this.speciality = speciality;
	}

	public EducationProgramDto getProgram() {
		return program;
	}

	public void setProgram(EducationProgramDto program) {
		this.program = program;
	}

	public Date getApplyToDate() {
		return applyToDate;
	}

	public void setApplyToDate(Date applyToDate) {
		this.applyToDate = applyToDate;
	}

	public Long getFromSchoolYear() {
		return fromSchoolYear;
	}

	public void setFromSchoolYear(Long fromSchoolYear) {
		this.fromSchoolYear = fromSchoolYear;
	}

	public Long getToSchoolYear() {
		return toSchoolYear;
	}

	public void setToSchoolYear(Long toSchoolYear) {
		this.toSchoolYear = toSchoolYear;
	}

	public Boolean getIsCurrent() {
		return isCurrent;
	}

	public void setIsCurrent(Boolean isCurrent) {
		this.isCurrent = isCurrent;
	}

	public Date getApplyFromDate() {
		return applyFromDate;
	}

	public void setApplyFromDate(Date applyFromDate) {
		this.applyFromDate = applyFromDate;
	}

	public SpecialityProgramDto() {

	}

	public SpecialityProgramDto(SpecialityProgram sp) {
		this.applyFromDate = sp.getApplyFromDate();
		this.applyToDate = sp.getApplyToDate();
		this.fromSchoolYear = sp.getFromSchoolYear();
		this.isCurrent = sp.getIsCurrent();
		this.toSchoolYear = sp.getToSchoolYear();
//		if (sp.getProgram() != null) {
//			this.program = new EducationProgramDto(sp.getProgram());
//		}
//		if (sp.getSpeciality() != null)
//			this.speciality = new SpecialityDto(sp.getSpeciality());
	}
}

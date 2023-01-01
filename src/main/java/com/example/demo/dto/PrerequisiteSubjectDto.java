package com.example.demo.dto;

import java.io.Serializable;

import com.globits.education.domain.EducationProgram;
import com.globits.education.domain.PrerequisiteSubject;
import com.globits.education.domain.ProgramSubject;
import com.globits.education.domain.Subject;

public class PrerequisiteSubjectDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long prerequisiteSubjectId;
	private Long subjectId;
	private Long programId;
	private String subjectName;
	private String subjectCode;
	private String prerequiteSubjectName;
	private String prerequiteSubjectCode;
	private double prerequiteMark;// Điểm tiên quyết tối thiểu.
	private int prerequiteType;// Loại học phần, tiên quyết hay song hành...
	private String displaySubjectName;
	private String displaySubjectCode;
	private SubjectDto prerequiteSubject;
	private ProgramSubjectDto programSubject;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPrerequisiteSubjectId() {
		return prerequisiteSubjectId;
	}

	public void setPrerequisiteSubjectId(Long prerequisiteSubjectId) {
		this.prerequisiteSubjectId = prerequisiteSubjectId;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public Long getProgramId() {
		return programId;
	}

	public void setProgramId(Long programId) {
		this.programId = programId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getPrerequiteSubjectName() {
		return prerequiteSubjectName;
	}

	public void setPrerequiteSubjectName(String prerequiteSubjectName) {
		this.prerequiteSubjectName = prerequiteSubjectName;
	}

	public String getPrerequiteSubjectCode() {
		return prerequiteSubjectCode;
	}

	public void setPrerequiteSubjectCode(String prerequiteSubjectCode) {
		this.prerequiteSubjectCode = prerequiteSubjectCode;
	}

	public double getPrerequiteMark() {
		return prerequiteMark;
	}

	public void setPrerequiteMark(double prerequiteMark) {
		this.prerequiteMark = prerequiteMark;
	}

	public int getPrerequiteType() {
		return prerequiteType;
	}

	public void setPrerequiteType(int prerequiteType) {
		this.prerequiteType = prerequiteType;
	}
	
	public String getDisplaySubjectName() {
		return displaySubjectName;
	}

	public void setDisplaySubjectName(String displaySubjectName) {
		this.displaySubjectName = displaySubjectName;
	}

	public String getDisplaySubjectCode() {
		return displaySubjectCode;
	}

	public void setDisplaySubjectCode(String displaySubjectCode) {
		this.displaySubjectCode = displaySubjectCode;
	}
	

	public SubjectDto getPrerequiteSubject() {
		return prerequiteSubject;
	}

	public void setPrerequiteSubject(SubjectDto prerequiteSubject) {
		this.prerequiteSubject = prerequiteSubject;
	}

	public ProgramSubjectDto getProgramSubject() {
		return programSubject;
	}

	public void setProgramSubject(ProgramSubjectDto programSubject) {
		this.programSubject = programSubject;
	}

	public PrerequisiteSubjectDto() {

	}
}

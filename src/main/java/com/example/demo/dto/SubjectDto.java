package com.example.demo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;

import com.globits.core.dto.DepartmentDto;
import com.globits.education.domain.ExamSkill;
import com.globits.education.domain.PrerequisiteSubject;
import com.globits.education.domain.Subject;
import com.globits.education.domain.SubjectEducationLevelType;
import com.globits.education.domain.SubjectExam;
import com.globits.education.domain.SubjectLearningSkill;

public class SubjectDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String subjectCode;// Mã môn học
	private String defineCode;

	private String subjectName;// Tên môn học (tiếng việt)

	private String subjectNameEng;// Tên môn học (tiếng việt)

	private int numberOfCredit;// Số lượng tín chỉ
	private Long departmentId;
	private String departmentName;
	private String departmentCode;
	private String departmentParentName;
	private Integer retCode=1;
	private Boolean isCurrentlyUsing;
	private Set<PrerequisiteSubjectDto> prerequisiteSubjects;
	private List<SubjectExamDto> exams;

	private DepartmentDto department; // Bộ môn quản lý
	
	List<SubjectLearningSkillDto> subjectLearningSkillDtos;
	private String totalSubjectName;// Tên môn học -số tín chỉ- mã môn
	
	private Boolean isCalculateMark;//Môn tính điểm hay không tính điểm
	private Integer subjectType;
	private String textSearch;
	
	private List<SubjectEducationLevelTypeDto> subjectLevelTypes;
	private Boolean voided;
	
	private ExamSkillDto examSkill; // hình thức thi mặc định
	
	private Integer examTime; //thời gian thi mặc định
	private Boolean checked;
	/*
	 * Tính học phí hay tính lệ phí
	 * 1 hoặc null: Tính học phí như thông thường
	 * 3 Lệ phí	 
	 * Const.ReceivePayAbleType
	 */
	private Integer feeType;
	private Long specilityId;
	private Long enrollmentClassId;
	private Long courseYearId;
	public Long getCourseYearId() {
		return courseYearId;
	}

	public void setCourseYearId(Long courseYearId) {
		this.courseYearId = courseYearId;
	}
	public Long getEnrollmentClassId() {
		return enrollmentClassId;
	}

	public void setEnrollmentClassId(Long enrollmentClassId) {
		this.enrollmentClassId = enrollmentClassId;
	}
	public Long getSpecilityId() {
		return specilityId;
	}

	public void setSpecilityId(Long specilityId) {
		this.specilityId = specilityId;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public List<SubjectEducationLevelTypeDto> getSubjectLevelTypes() {
		return subjectLevelTypes;
	}

	public void setSubjectLevelTypes(List<SubjectEducationLevelTypeDto> subjectLevelTypes) {
		this.subjectLevelTypes = subjectLevelTypes;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Boolean getIsCalculateMark() {
		return isCalculateMark;
	}

	public void setIsCalculateMark(Boolean isCalculateMark) {
		this.isCalculateMark = isCalculateMark;
	}

	public Integer getSubjectType() {
		return subjectType;
	}

	public void setSubjectType(Integer subjectType) {
		this.subjectType = subjectType;
	}

	public ExamSkillDto getExamSkill() {
		return examSkill;
	}

	public void setExamSkill(ExamSkillDto examSkill) {
		this.examSkill = examSkill;
	}

	public Integer getExamTime() {
		return examTime;
	}

	public void setExamTime(Integer examTime) {
		this.examTime = examTime;
	}

	public String getSubjectNameEng() {
		return subjectNameEng;
	}

	public void setSubjectNameEng(String subjectNameEng) {
		this.subjectNameEng = subjectNameEng;
	}

	public int getNumberOfCredit() {
		return numberOfCredit;
	}

	public void setNumberOfCredit(int numberOfCredit) {
		this.numberOfCredit = numberOfCredit;
	}

	public Boolean getIsCurrentlyUsing() {
		return isCurrentlyUsing;
	}

	public void setIsCurrentlyUsing(Boolean isCurrentlyUsing) {
		this.isCurrentlyUsing = isCurrentlyUsing;
	}

	public Set<PrerequisiteSubjectDto> getPrerequisiteSubjects() {
		return prerequisiteSubjects;
	}

	public void setPrerequisiteSubjects(Set<PrerequisiteSubjectDto> prerequisiteSubjects) {
		this.prerequisiteSubjects = prerequisiteSubjects;
	}

	public DepartmentDto getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentDto department) {
		this.department = department;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}	

	public String getDepartmentParentName() {
		return departmentParentName;
	}

	public void setDepartmentParentName(String departmentParentName) {
		this.departmentParentName = departmentParentName;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public Integer getRetCode() {
		return retCode;
	}

	public void setRetCode(Integer retCode) {
		this.retCode = retCode;
	}

	public List<SubjectExamDto> getExams() {
		return exams;
	}

	public void setExams(List<SubjectExamDto> exams) {
		this.exams = exams;
	}

	public List<SubjectLearningSkillDto> getSubjectLearningSkillDtos() {
		return subjectLearningSkillDtos;
	}

	public void setSubjectLearningSkillDtos(List<SubjectLearningSkillDto> subjectLearningSkillDtos) {
		this.subjectLearningSkillDtos = subjectLearningSkillDtos;
	}
	
	public String getTotalSubjectName() {
		return totalSubjectName;
	}

	public void setTotalSubjectName(String totalSubjectName) {
		this.totalSubjectName = totalSubjectName;
	}

	public String getTextSearch() {
		return textSearch;
	}

	public void setTextSearch(String textSearch) {
		this.textSearch = textSearch;
	}

	public Boolean getVoided() {
		return voided;
	}

	public void setVoided(Boolean voided) {
		this.voided = voided;
	}

	public String getDefineCode() {
		return defineCode;
	}

	public void setDefineCode(String defineCode) {
		this.defineCode = defineCode;
	}	

	public Boolean getChecked() {
		return checked;
	}

	public void setChecked(Boolean checked) {
		this.checked = checked;
	}

	public Integer getFeeType() {
		return feeType;
	}

	public void setFeeType(Integer feeType) {
		this.feeType = feeType;
	}

	public SubjectDto() {

	}
	
}

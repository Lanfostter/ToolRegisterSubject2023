package com.example.demo.dto;

import java.io.Serializable;

import com.globits.education.domain.SemesterSubject;
import com.globits.education.domain.SubjectExam;
import com.globits.education.domain.TrainingBaseSemesterSubject;

public class SubjectExamDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String code;
	private SubjectDto subject;
	private double coefficient;
	private Integer inputMarkType;// =0 tự nhập, =1 là tính toán
	private Integer examType;
	private SemesterSubjectDto semesterSubject;
	private String subjectExamName;
	private Integer type;//loại điểm =1: kiểm tra,=2: quá trình; =3 điểm thi
	private String semesterName;
	private SubjectExamTypeDto subjectExamType;
	private Integer coffi;//hệ số theo số nguyên 30,40,...
	private CourseSubjectDto courseSubject;
	private Boolean voided;
	private Long nodeId;
	private Integer nodeType;
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

	public SubjectDto getSubject() {
		return subject;
	}

	public void setSubject(SubjectDto subject) {
		this.subject = subject;
	}

	public double getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(double coefficient) {
		this.coefficient = coefficient;
	}

	public Integer getInputMarkType() {
		return inputMarkType;
	}

	public void setInputMarkType(Integer inputMarkType) {
		this.inputMarkType = inputMarkType;
	}

	public Integer getExamType() {
		return examType;
	}

	public void setExamType(Integer examType) {
		this.examType = examType;
	}
	
	public SemesterSubjectDto getSemesterSubject() {
		return semesterSubject;
	}

	public void setSemesterSubject(SemesterSubjectDto semesterSubject) {
		this.semesterSubject = semesterSubject;
	}	

	public String getSubjectExamName() {
		return subjectExamName;
	}

	public void setSubjectExamName(String subjectExamName) {
		this.subjectExamName = subjectExamName;
	}
	
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}	

	public String getSemesterName() {
		return semesterName;
	}

	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}	

	public SubjectExamTypeDto getSubjectExamType() {
		return subjectExamType;
	}

	public void setSubjectExamType(SubjectExamTypeDto subjectExamType) {
		this.subjectExamType = subjectExamType;
	}	

	public Integer getCoffi() {
		return coffi;
	}

	public void setCoffi(Integer coffi) {
		this.coffi = coffi;
	}	

	public CourseSubjectDto getCourseSubject() {
		return courseSubject;
	}

	public void setCourseSubject(CourseSubjectDto courseSubject) {
		this.courseSubject = courseSubject;
	}	
	public Boolean getVoided() {
		return voided;
	}

	public void setVoided(Boolean voided) {
		this.voided = voided;
	}	

	public Long getNodeId() {
		return nodeId;
	}

	public void setNodeId(Long nodeId) {
		this.nodeId = nodeId;
	}

	public Integer getNodeType() {
		return nodeType;
	}

	public void setNodeType(Integer nodeType) {
		this.nodeType = nodeType;
	}

	public SubjectExamDto() {

	}
}

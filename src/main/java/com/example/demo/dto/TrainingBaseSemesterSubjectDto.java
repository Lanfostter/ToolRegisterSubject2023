package com.example.demo.dto;

import com.globits.core.dto.TrainingBaseDto;
import com.globits.education.domain.TrainingBaseSemesterSubject;

public class TrainingBaseSemesterSubjectDto {
	private Long id;
	private Integer numberCourseSubject;
	private Long semesterSubjectId;
	private Long trainingBaseId;
	private SemesterSubjectDto semesterSubject;
	private TrainingBaseDto trainingBase;
	
	private int maxNumberStudentPerChildCourse;
	private int maxNumberStudentPerParentCourse;
	private int minNumberStudentPerChildCourse;
	private int minNumberStudentPerParentCourse;
	private int numberChildCourse;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getNumberCourseSubject() {
		return numberCourseSubject;
	}
	public void setNumberCourseSubject(Integer numberCourseSubject) {
		this.numberCourseSubject = numberCourseSubject;
	}
	public Long getSemesterSubjectId() {
		return semesterSubjectId;
	}
	public void setSemesterSubjectId(Long semesterSubjectId) {
		this.semesterSubjectId = semesterSubjectId;
	}
	public Long getTrainingBaseId() {
		return trainingBaseId;
	}
	public void setTrainingBaseId(Long trainingBaseId) {
		this.trainingBaseId = trainingBaseId;
	}
	public SemesterSubjectDto getSemesterSubject() {
		return semesterSubject;
	}
	public void setSemesterSubject(SemesterSubjectDto semesterSubject) {
		this.semesterSubject = semesterSubject;
	}
	public TrainingBaseDto getTrainingBase() {
		return trainingBase;
	}
	public void setTrainingBase(TrainingBaseDto trainingBase) {
		this.trainingBase = trainingBase;
	}	
	
	public int getMaxNumberStudentPerChildCourse() {
		return maxNumberStudentPerChildCourse;
	}
	public void setMaxNumberStudentPerChildCourse(int maxNumberStudentPerChildCourse) {
		this.maxNumberStudentPerChildCourse = maxNumberStudentPerChildCourse;
	}
	public int getMaxNumberStudentPerParentCourse() {
		return maxNumberStudentPerParentCourse;
	}
	public void setMaxNumberStudentPerParentCourse(int maxNumberStudentPerParentCourse) {
		this.maxNumberStudentPerParentCourse = maxNumberStudentPerParentCourse;
	}
	public int getMinNumberStudentPerChildCourse() {
		return minNumberStudentPerChildCourse;
	}
	public void setMinNumberStudentPerChildCourse(int minNumberStudentPerChildCourse) {
		this.minNumberStudentPerChildCourse = minNumberStudentPerChildCourse;
	}
	public int getMinNumberStudentPerParentCourse() {
		return minNumberStudentPerParentCourse;
	}
	public void setMinNumberStudentPerParentCourse(int minNumberStudentPerParentCourse) {
		this.minNumberStudentPerParentCourse = minNumberStudentPerParentCourse;
	}
	public int getNumberChildCourse() {
		return numberChildCourse;
	}
	public void setNumberChildCourse(int numberChildCourse) {
		this.numberChildCourse = numberChildCourse;
	}
	public TrainingBaseSemesterSubjectDto() {
		
	}
}

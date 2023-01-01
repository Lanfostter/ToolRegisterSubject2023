package com.example.demo.dto;

import com.globits.core.dto.TrainingBaseDto;

public class TrainingBaseSemesterSubjectExamDto {
	private Long id;
	private Integer numberOfExamRoom;
	private Long semesterSubjectId;
	private Long trainingBaseId;
	private SemesterSubjectExamDto semesterSubjectExam;
	private TrainingBaseDto trainingBase;
	private ExamSkillDto examSkill;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	
	public TrainingBaseDto getTrainingBase() {
		return trainingBase;
	}
	public void setTrainingBase(TrainingBaseDto trainingBase) {
		this.trainingBase = trainingBase;
	}	
	
	public Integer getNumberOfExamRoom() {
		return numberOfExamRoom;
	}
	public void setNumberOfExamRoom(Integer numberOfExamRoom) {
		this.numberOfExamRoom = numberOfExamRoom;
	}
	public SemesterSubjectExamDto getSemesterSubjectExam() {
		return semesterSubjectExam;
	}
	public void setSemesterSubjectExam(SemesterSubjectExamDto semesterSubjectExam) {
		this.semesterSubjectExam = semesterSubjectExam;
	}
	
	public ExamSkillDto getExamSkill() {
		return examSkill;
	}
	public void setExamSkill(ExamSkillDto examSkill) {
		this.examSkill = examSkill;
	}
	public TrainingBaseSemesterSubjectExamDto() {
		
	}
	
}

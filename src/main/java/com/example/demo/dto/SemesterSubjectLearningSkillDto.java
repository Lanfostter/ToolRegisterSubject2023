package com.example.demo.dto;

import com.globits.education.domain.SemesterSubjectLearningSkill;

public class SemesterSubjectLearningSkillDto {
	private SemesterSubjectDto semesterSubject;
	private LearningSkillDto learningSkill;
	private Double numberHours;//Số giờ học
	
	private Integer numberSkillClass;//Số lớp thuộc kỹ năng này cho mỗi lớp cha
	private Integer maxNumberStudent;//Số sinh viên tối đa trong 1 lớp
	private Integer minNumberStudent;//Số sinh viên tối thiểus trong 1 lớp
	public SemesterSubjectDto getSemesterSubject() {
		return semesterSubject;
	}
	public void setSemesterSubject(SemesterSubjectDto semesterSubject) {
		this.semesterSubject = semesterSubject;
	}
	public LearningSkillDto getLearningSkill() {
		return learningSkill;
	}
	public void setLearningSkill(LearningSkillDto learningSkill) {
		this.learningSkill = learningSkill;
	}
	public Double getNumberHours() {
		return numberHours;
	}
	public void setNumberHours(Double numberHours) {
		this.numberHours = numberHours;
	}
	
	
	
	public Integer getMaxNumberStudent() {
		return maxNumberStudent;
	}
	public void setMaxNumberStudent(Integer maxNumberStudent) {
		this.maxNumberStudent = maxNumberStudent;
	}
	public Integer getMinNumberStudent() {
		return minNumberStudent;
	}
	public void setMinNumberStudent(Integer minNumberStudent) {
		this.minNumberStudent = minNumberStudent;
	}
	public Integer getNumberSkillClass() {
		return numberSkillClass;
	}
	public void setNumberSkillClass(Integer numberSkillClass) {
		this.numberSkillClass = numberSkillClass;
	}
	public SemesterSubjectLearningSkillDto() {
		
	}
	
	public SemesterSubjectLearningSkillDto(SemesterSubjectLearningSkill entity) {
		if(entity!=null) {
			if(entity.getSemesterSubject()!=null) {
				this.semesterSubject = new SemesterSubjectDto();
				this.semesterSubject.setId(entity.getSemesterSubject().getId());
				this.semesterSubject.setSubjectName(entity.getSemesterSubject().getSubjectName());
			}
			if(entity.getLearningSkill()!=null) {
				learningSkill = new LearningSkillDto();
				learningSkill.setId(entity.getLearningSkill().getId());
				learningSkill.setCode(entity.getLearningSkill().getCode());
				learningSkill.setName(entity.getLearningSkill().getName());
			}
			this.setNumberHours(entity.getNumberHours());
			this.setNumberSkillClass(entity.getNumberSkillClass());
			this.setMinNumberStudent(entity.getMinNumberStudent());
			this.setMaxNumberStudent(entity.getMaxNumberStudent());
		}
		
	}
	
}

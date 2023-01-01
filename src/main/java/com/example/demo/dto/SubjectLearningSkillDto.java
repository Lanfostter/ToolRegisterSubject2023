package com.example.demo.dto;

import com.globits.education.domain.SubjectLearningSkill;

public class SubjectLearningSkillDto {
	
	private Long id;
	
	private LearningSkillDto learningSkill;
	
	private SubjectDto subject;
	
	private Boolean isMainSkill;
	
	private Double numberHours;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LearningSkillDto getLearningSkill() {
		return learningSkill;
	}

	public void setLearningSkill(LearningSkillDto learningSkill) {
		this.learningSkill = learningSkill;
	}

	public SubjectDto getSubject() {
		return subject;
	}

	public void setSubject(SubjectDto subject) {
		this.subject = subject;
	}

	public Boolean getIsMainSkill() {
		return isMainSkill;
	}

	public void setIsMainSkill(Boolean isMainSkill) {
		this.isMainSkill = isMainSkill;
	}

	public Double getNumberHours() {
		return numberHours;
	}

	public void setNumberHours(Double numberHours) {
		this.numberHours = numberHours;
	}
	public SubjectLearningSkillDto() {
		
	}
	
	public SubjectLearningSkillDto(SubjectLearningSkill entity) {
		if(entity!=null) {
			this.id = entity.getId();
			if(entity.getSubject()!=null) {
				this.subject = new SubjectDto();
				this.subject.setId(entity.getSubject().getId());
				this.subject.setSubjectName(entity.getSubject().getSubjectName());
				this.subject.setSubjectCode(entity.getSubject().getSubjectCode());
			}
			if(entity.getLearningSkill()!=null) {
				this.learningSkill = new LearningSkillDto();
				this.learningSkill.setId(entity.getLearningSkill().getId());
				this.learningSkill.setCode(entity.getLearningSkill().getCode());
				this.learningSkill.setName(entity.getLearningSkill().getName());
			}
			this.numberHours = entity.getNumberHours();
			this.isMainSkill = entity.getIsMainSkill();
		}
	}
	
}

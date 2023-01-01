package com.example.demo.dto;

import com.globits.education.domain.GroupSubjectProgram;

public class GroupSubjectProgramDto {
	private Long id;
	private String name;
	
	private String code;
	private Integer minNumberCredit;//Số lượng tín chỉ tối thiểu cần tích lũy cho nhóm kiến thức này
	private EducationProgramDto program;
	private GroupSubjectProgramDto parent;
	
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
	public Integer getMinNumberCredit() {
		return minNumberCredit;
	}
	public void setMinNumberCredit(Integer minNumberCredit) {
		this.minNumberCredit = minNumberCredit;
	}
	public EducationProgramDto getProgram() {
		return program;
	}
	public void setProgram(EducationProgramDto program) {
		this.program = program;
	}
	public GroupSubjectProgramDto getParent() {
		return parent;
	}
	public void setParent(GroupSubjectProgramDto parent) {
		this.parent = parent;
	}
	public GroupSubjectProgramDto() {
		
	}
	public static GroupSubjectProgramDto convertToDto(GroupSubjectProgram gsp) {
		GroupSubjectProgramDto ret = new GroupSubjectProgramDto();
		if(gsp!=null) {
			ret.setId(gsp.getId());
			ret.setCode(gsp.getCode());
			ret.setName(gsp.getName());
			ret.setMinNumberCredit(gsp.getMinNumberCredit());
			if(gsp.getParent()!=null) {
				GroupSubjectProgramDto parent = new GroupSubjectProgramDto();
				parent.setId(gsp.getParent().getId());
				parent.setCode(gsp.getParent().getCode());
				parent.setName(gsp.getParent().getName());	
				ret.setParent(parent);
			}
			if(gsp.getProgram()!=null) {
				EducationProgramDto program = new  EducationProgramDto(gsp.getProgram());
				ret.setProgram(program);
			}
		}
		return ret;
		
	}
	public GroupSubjectProgramDto(GroupSubjectProgram gsp) {
		if(gsp!=null) {
			this.setId(gsp.getId());
			this.setCode(gsp.getCode());
			this.setName(gsp.getName());
			this.setMinNumberCredit(gsp.getMinNumberCredit());
			if(gsp.getParent()!=null) {
				GroupSubjectProgramDto parent = new GroupSubjectProgramDto();
				parent.setId(gsp.getParent().getId());
				parent.setCode(gsp.getParent().getCode());
				parent.setName(gsp.getParent().getName());	
				this.setParent(parent);
			}
			if(gsp.getProgram()!=null) {
				EducationProgramDto program = new  EducationProgramDto(gsp.getProgram());
				this.setProgram(program);
			}
		}
	}
	
}

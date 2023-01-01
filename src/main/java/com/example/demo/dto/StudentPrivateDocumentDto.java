package com.example.demo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.globits.education.domain.StudentPrivateDocument;

public class StudentPrivateDocumentDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String code;
	private String name;
	private String description;// diễn tả
	
	private Integer amountsOf;
	
	private Boolean hasProfile;
	
	private StudentPrivateDocumentDto parent;
	
	private List<StudentPrivateDocumentDto> children = new ArrayList<StudentPrivateDocumentDto>();
	
	public List<StudentPrivateDocumentDto> getChild() {
		return children;
	}

	public void setChild(List<StudentPrivateDocumentDto> child) {
		this.children = child;
	}

	public StudentPrivateDocumentDto getParent() {
		return parent;
	}

	public void setParent(StudentPrivateDocumentDto parent) {
		this.parent = parent;
	}

	public Integer getAmountsOf() {
		return amountsOf;
	}

	public void setAmountsOf(Integer amountsOf) {
		this.amountsOf = amountsOf;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public StudentPrivateDocumentDto() {
		super();
	} 
	
	public List<StudentPrivateDocumentDto> getChildrenList(StudentPrivateDocument entity){
		
		return null;
	}

	public StudentPrivateDocumentDto(StudentPrivateDocument entity) {
		super();
		this.id = entity.getId();
		this.code = entity.getCode();
		this.name = entity.getName();
		this.description = entity.getDescription();
		this.amountsOf = entity.getAmountsOf();
		if(entity.getParent() != null) {
			this.parent = new StudentPrivateDocumentDto();
			parent.setCode(entity.getParent().getCode());
			parent.setName(entity.getParent().getName());
			parent.setId(entity.getParent().getId());
//			this.setChild(getChildrenList(entity));
		}
		
	} 

}

package com.example.demo.dto;

import java.io.Serializable;

import javax.persistence.Column;

import com.globits.education.domain.KnowledgeBlock;

public class KnowledgeBlockDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String code;
	private String description;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public KnowledgeBlockDto() {

	}

	public KnowledgeBlockDto(KnowledgeBlock kb) {
		if(kb != null) {
			this.description = kb.getDescription();
			this.code = kb.getCode();
			this.name = kb.getName();
			this.id = kb.getId();
		}
	}
}

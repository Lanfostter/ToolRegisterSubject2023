package com.example.demo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.globits.core.domain.Department;
import com.globits.core.dto.DepartmentDto;
import com.globits.education.domain.Semester;
import com.globits.education.domain.Speciality;
import com.globits.education.domain.SpecialityProgram;

public class SpecialityDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String code;
	private String numbericCode;
	private SpecialityDto parent;
	private DepartmentDto department;
	private Set<SpecialityProgramDto> programs;
	private Boolean isGroup;
	private int retCode=1;
	private List<SpecialityDto> children;
	private String nameEng;//tên tiếng anh
	public Long getId() {
		return id;
	}

	public String getNumbericCode() {
		return numbericCode;
	}

	public void setNumbericCode(String numbericCode) {
		this.numbericCode = numbericCode;
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

	public SpecialityDto getParent() {
		return parent;
	}

	public void setParent(SpecialityDto parent) {
		this.parent = parent;
	}

	public DepartmentDto getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentDto department) {
		this.department = department;
	}

	public Set<SpecialityProgramDto> getPrograms() {
		return programs;
	}

	public void setPrograms(Set<SpecialityProgramDto> programs) {
		this.programs = programs;
	}

	public Boolean getIsGroup() {
		return isGroup;
	}

	public void setIsGroup(Boolean isGroup) {
		this.isGroup = isGroup;
	}

	public int getRetCode() {
		return retCode;
	}

	public void setRetCode(int retCode) {
		this.retCode = retCode;
	}
	
	public List<SpecialityDto> getChildren() {
		return children;
	}

	public void setChildren(List<SpecialityDto> children) {
		this.children = children;
	}

	public String getNameEng() {
		return nameEng;
	}

	public void setNameEng(String nameEng) {
		this.nameEng = nameEng;
	}

	public SpecialityDto() {

	}

	private List<SpecialityDto> getListChildren(Speciality spe){
		List<SpecialityDto> ret = new ArrayList<SpecialityDto>();
		
		if(spe.getSubSpecialities()!=null && spe.getSubSpecialities().size()>0) {
			for(Speciality s : spe.getSubSpecialities()) {
				SpecialityDto sDto = new SpecialityDto();
				sDto.setId(s.getId());
				sDto.setCode(s.getCode());
				sDto.setName(s.getName());
				sDto.setChildren(getListChildren(s));
				sDto.setNumbericCode(s.getNumbericCode());
				sDto.setNameEng(s.getNameEng());
				ret.add(sDto);
			}
		}
		return ret;
	}

	public SpecialityDto(Speciality spe) {
		this.id =spe.getId();
		this.code = spe.getCode();
		this.name = spe.getName();
		this.nameEng=spe.getNameEng();
		this.numbericCode = spe.getNumbericCode();
		if (spe.getParent() != null) {
			Speciality parent = spe.getParent();
			this.parent = new SpecialityDto();
			this.parent.setCode(parent.getCode());
			this.parent.setId(parent.getId());
		}
		if (spe.getDepartment() != null) {
			Department department = spe.getDepartment();
			this.department = new DepartmentDto();
			this.department.setCode(department.getCode());
			this.department.setId(department.getId());
			this.department.setName(department.getName());
		}
		if(spe.getIsGroup()!=null) {
			this.setIsGroup(spe.getIsGroup());
		}
		if (spe.getPrograms() != null) {
			this.programs = new HashSet<SpecialityProgramDto>();
			Iterator<SpecialityProgram> iters = spe.getPrograms().iterator();
			while (iters.hasNext()) {
				SpecialityProgram sp = iters.next();
				SpecialityProgramDto spDto= new SpecialityProgramDto();
				spDto.setApplyFromDate(sp.getApplyFromDate());
				spDto.setApplyToDate(sp.getApplyToDate());
				spDto.setFromSchoolYear(sp.getFromSchoolYear());
				spDto.setIsCurrent(sp.getIsCurrent());
				spDto.setToSchoolYear(sp.getToSchoolYear());
				this.programs.add(spDto);
			}
		}
		this.setChildren(getListChildren(spe));
	}
	
	public SpecialityDto(Long id, String name, String code) {
		this.id = id;
		this.code = code;
		this.name = name;
	}
	
	public SpecialityDto(Speciality spe, Boolean simple) {
		if (spe != null) {
			this.id =spe.getId();
			this.code = spe.getCode();
			this.name = spe.getName();
			this.nameEng=spe.getNameEng();
		}
	}
}
